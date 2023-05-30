# Ejercicio 1
# realizar la evaluacion de una nota
# si la nota esta entre 100 y 90  -> excelente
# si la nota esta entre 89 - 90 -> satisfactorio
# si la nota esta entre 79 - 70 -> regular
# si la nota esta entre 69 -70 -> bueno
# si la nota esta entre 59 -0 -> malo

x = 95
case x do
  x when x < 59 -> IO.puts "malo"
  x when x > 69 and x < 70 -> IO.puts "bueno"
  x when x > 70 and x < 79 -> IO.puts "regular"
  x when x > 89 and x < 90 -> IO.puts "satisfactorio"
  x when x > 90 and x < 100 -> IO.puts "excelente"
  _ -> IO.puts "Ninguna nota conicide"
end


## Ejercicio 2  
## identifique cual es elmayor entre 3 numeros
numbers = [1,5,9]

maximo = fn (num_list) -> Enum.max(num_list) end
valor_mas_grande = maximo.(numbers)
IO.puts "El valor mas grande es #{valor_mas_grande}"

