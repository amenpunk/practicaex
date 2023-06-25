(defrecord Usuario [id nombre email])

;; base de datos temporal para almaacenar los usuarios
(def usuarios (atom {}))

(defn crear-usuario [nombre email]
  (let [id (count @usuarios)]
    (swap! usuarios assoc id (->Usuario id nombre email))
    (println "El usuario creado es" id)))

(defn leer-usuario [id]
  (@usuarios id))

(defn consultar-por-id [id]
  (let [usuario (leer-usuario id)]
    (if usuario
      (println "El usuario es" usuario)
      (println "El usuario no existe"))
    (when usuario
      (println "ID:" (:id usuario))
      (println "Nombre:" (:nombre usuario))
      (println "Email:" (:email usuario)))))

(defn actualizar-usuario [id nombre email]
  (if (@usuarios id)
    (swap! usuarios assoc id (->Usuario id nombre email))
    (throw (Exception. "El usuario no existe"))))

(defn eliminar-usuario [id]
  (swap! usuarios dissoc id))

;listado  general de usuario

(defn leer-usuarios []
  (println "Listado de usuarios")
  (doseq [[id usuario] @usuarios]
    (println "ID:" (:id usuario))
    (println "Nombre" (:nombre usuario))
    (println "Email" (:email usuario))))

(defn salir []
  ( println "Saliendo del programa")
  (System/exit 0))

(defn crear[]
  (println "Ingrese primero el nombre y luego el email del usuario")
  (let [nombre(read-line) email (read-line)]
      (crear-usuario nombre email)
      (flush)
    )
  )

(defn actualizar[]
  (println "Ingrese el id del usuario a actualizar")
  (let [id (Integer/parseInt (read-line)) nombre (read-line) email(read-line)  ]
    (actualizar-usuario id nombre email)
    (flush)
  )
)

(defn leer-usuario-ind[]
  (println "Ingrese el id del usuario a consultar:")
  ( let [id (Integer/parseInt (read-line))]
    (consultar-por-id id)
    (flush)
  )
)

(defn eliminar[]
  (println "Ingrese el id del usuario a eliminar")
  (let [id (Integer/parseInt (read-line))]
    (eliminar-usuario id)
    (flush)
  )
)

( defn -main[]
  (loop []
    ( println "\nSeleccione una opcion")
    ( println "1. Crear usuario")
    ( println "2. Actualizar datos del usuario")
    ( println "3. Leer los datos de un usuario")
    ( println "4. Listar a todos los usuario")
    ( println "5. Borar un usuario")
    ( println "0. Salir")
    ( println "Opcion: ")
    (flush)
    (let [opcion (read-line)](println opcion)
    (cond 
      (= opcion "0") (salir)
      (= opcion "1") (crear)
      (= opcion "2") (actualizar)
      (= opcion "3") (leer-usuario-ind)
      (= opcion "4") (leer-usuarios)
      (= opcion "5") (eliminar)
      :else (println "Opcion no valida")))
     (recur)
     )
  )

(-main)
