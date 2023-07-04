// ejemplo 1 
let calcularAreaCirculo  radio =
  let pi = 3.14159
  let area = pi * radio * radio
  area


let area = calcularAreaCirculo 5.0
printfn "El area del circulo es: %f" area

// ejemplo 2 
let encontrarMaximo lista =
  List.max lista

let numeros = [12;5;4;7;20;1]
let maximo = encontrarMaximo numeros
printf "El maximo es: %d" maximo


// ejemplo 3

let sumList list =
  List.fold (+) 0 list

let numbers = [2;4;6;8]
let sum = sumList numbers
printf "La suma de los elementos de la lista es : %d" sum


// ejemplo 4
let isListSorted list =
  List.sort list = list

let sortedList = [1;2;3;4;5]
let unsortedList = [5;3;2;4;1]

let isSorted = isListSorted sortedList
let isUnsorted = isListSorted unsortedList

printf "La lista ordenada esta ordenada: %b" isSorted
printf "la lista desordenada esta ordenada: %b" isUnsorted

// ejemplo 5
let countCharacteres str =
  String.length str

let text = "Hola, mundo!"
let charCount = countCharacteres text
printf "La cantididad de caracteres en el texto es : %d" charCount

// ejemplo 6
for i in 1 .. 10 do
  printf "%d " i

// ejmeplo 7

let mutable count = 1

while count <= 4 do
  printf "%d " count
  count <- count + 1

// ejemplo 8
let myList = [1;3;5;7;9]
for item in myList do
  printf "%d " item

// ejemplo 9
let myString = "Hola"
for char in myString do
  printf "%c " char

// ejmeplo 10
for i in 1 .. 10 do
  if i % 2 = 0 then
    printf "%d " i

// Ejemplo 11
type Persona (nombre:string,edad: int) = 
  member this.Nombre = nombre
  member this.Edad = edad
  member this.Saludar() = 
    printf "Hola, soy %s y tengo %d años" this.Nombre this.Edad

let person1 = Persona("Juan", 30)
let person2 = Persona("Sheyla", 20)

person1.Saludar()
person2.Saludar()


// Ejercicio
// realice un ejercicio de su preferencia, agregando cualquier funcionalidad que desee
// agregando cualquiera de los temas vistos en la practic

type Carro (marca:string,modelo:string,anio:int) = 
  member this.Marca = marca
  member this.Modelo = modelo
  member this.Anio = anio
  member this.Mostrar() = 
    printf "Marca: %s, Modelo: %s, Año: %d" this.Marca this.Modelo this.Anio

let mazda = Carro("Mazda","3",2019)
let toyota = Carro("Toyota","Corolla",2018)

mazda.Mostrar()
toyota.Mostrar()
