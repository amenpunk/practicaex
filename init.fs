let edad : int = 25
let cantidadPeronas = 10
let ip : float = 3.1416
let precioProducto = 9.99
let esMayorEdad :bool = true
let estaLloviendo = false

let nombre : string ="Juan"
let saludo = "Hola mundo"

let numeros : int list = [1;2;3;4;5]
let nombres = ["Maria";"Luis";"Sheyla"]

//let persona : string - int = ("juan",25)
let coordenadas = (3.5, -2.7)
type Persona = {Nombre: string; Edad: int}
let persona1 = {Nombre = "Maria"; Edad = 15}
let persona2 = {Nombre = "Ana"; Edad = 20}

let x = 0
let y = 3.14
let message = "Hola"
let istrue = true
let suma a b = a + b
let resultado = suma 5 3
printf "El resultado de la suma es: %d" resultado

let evaluarNumero numero = 
    match numero with
    | 0 -> printf "El numero es cero"
    | n when n > 0 -> printf "El Numero es positivo"
    | _ -> printf "El numero es negativo"

evaluarNumero 20
evaluarNumero 0
evaluarNumero (-2)

let esMayorEdad2 edad =
    if edad >= 18 then
        printf "Es mayor de edad"
    else
        printf "Es menor de edad"

esMayorEdad2 20
esMayorEdad2 15

let numeros2 = [1;2;3;4;5]

let cuadrados = 
    List.map(fun x -> x * x ) numeros2

let sumaTotal = 
    List.fold (+) 0 cuadrados

printf "Cuadrados: %A" cuadrados
printf "Suma total: %d" sumaTotal

let numeros3 = [1;2;3;4;5]
let pares = List.filter (fun x -> x % 2 = 0) numeros3
printf "Numeros pares %A" pares


let numeros4 = [1;2;3;4;5]
let suma1 = List.fold (fun acc x -> acc + x) 0 numeros4
printf "Suma total: %d" suma1


/// Ejercicio
// Realice una funcion utilizando un condicional por medio de una lista
/// utlizando la funcion filter e imprimiendo los resultados finales

let zeroList = [0;2;4;0;4;5;0]

let countZeros = List.filter (fun x -> x > 0) zeroList
printf "Lista sin ceros: %A" countZeros

