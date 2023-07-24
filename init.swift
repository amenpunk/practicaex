import Foundation

enum Operations: Int {
    case suma  = 1
    case resta = 2
    case multiplicacion = 3
    case division = 4
    case potencia = 5
}

func calculadora(_ number1:Double,_ number2:Double,_ operation:Int) -> Double? {

    if let operationInput = Operations(rawValue: operation) {
        switch operationInput {
            case .suma:
                return number1 + number2
            case .resta:
                return number1 - number2
            case .multiplicacion:
                return number1 * number2
            case .division:
                if number2 != 0 {
                    return number1 / number2
                } else {
                    print("Error: División entre cero no está permitida.")
                    return nil
                }
            case .potencia:
                return pow(number1, number2)
        }
    } else{
        print("Operacion incorrecta")
    }
    return nil
}


print("Bienvenido a la calculadora en switft \n")
print("1. Suma")
print("2. Resta")
print("3. Multiplicacion")
print("4. Division")
print("5. Potencia")
print("Selecciona una operacion: ")


var ejecutar = true
while ejecutar {
    if let optionInput = readLine(), let option = Int(optionInput) {
        if option >= 1 && option < 5 {
            print("Ingresa el primer numero: ")
            if let input1 = readLine(), let number1 = Double(input1) {
                print("Ingresa el segundo numero: ")
                if let input2 = readLine(), let number2 = Double(input2) {
                    if let result = calculadora(number1, number2, option){
                        print("El resultado es: \(result ?? 0)")
                    }else {
                        print("Error en operacion")
                    }
                } else {
                    print("Numero incorrecto")
                }
            } else {
                print("Numero incorrecto")
            }
        } else {
            print("Operacion incorrecta")
        }

    } else {
        print("Operacion no soportada")
    }
    print("Desea realizar otra operacion? (s/n) : ")
    if let ejecutarInput = readLine(), ejecutarInput.lowercased() != "s"{
        ejecutar = false
    }
}
 
print("Fin de la calculadora en swift")
