(ns init
  (:gen-class))

(defn hello-world []
  (println "Hello World"))
; (hello-world)

(defn suma [a b] 
  (+ a b) 
)

; (println  suma 1 2)

(defn muiltply [] 
  ( loop [y 2] (
      (when (< y 10))
      (println y)
      (recur (* y 2))
    )
  )
)

; (muiltply)

( 
 if (< y 20) 
   ( println y)
   ( println "valor mayor a 20")
)
