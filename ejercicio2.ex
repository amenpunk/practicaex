# case
# compara un valor hacia distintos patrones
# y el primero que coincida es el que se ejecuta

case {1,2,3} do
  {4,5,6} -> 
    IO.puts "Esta clausula no coincide"
  {1,x,3} -> 
    IO.puts "Esta clausula coincide y el valor de x se lo asociara a 2"
    _ -> IO.puts "Esta clausula no hara coincidencia con ningun valor"
    end

x  = 5

case 10 do
  x -> IO.puts "no coincide"
  _ -> IO.puts "coincide"
end

case {1,2,3} do
  {1,x,3} when x > 0 -> IO.puts "si coincide"
    _ -> IO.puts "no coincide si la condicion no es satisfactoria"
end

# case 1 do
#  x when hd(x) -> IO.puts "no coincide"
#  x -> IO.puts "obtiene #{x}"
# end


## cond evelua las coindiciones de arriba hacia abajo y la primera que coincide es la que ejecuta
## es muy parecido a utilizar else if de otros lenguajes

cond do
  2 + 2 === 5 -> IO.puts "Esto no es verdad"
  2 * 2 === 3 -> IO.puts "Esto tampoco es verdad"
  1 + 1 === 2 -> IO.puts "Esto si es verdad"
end

cond do
  2 + 2 === 5 -> IO.puts "Esto no es verdadero"
  2 * 2 === 3 -> IO.puts "tampoco esto"
  true -> IO.puts "esto siempre es verdadero"
end


cond do
  2 + 2 === 5 -> IO.puts "Esto no es verdadero"
  2 * 2 === 3 -> IO.puts "tampoco esto"
  1 + 1 === 2 -> "esto no es verdadero"
end

## if y unless
## if espera un condicion verdader
## se utliza cuando solo se quiere evaluar una condicion

if true do
  IO.puts "Si coincide"
end

## unles retorn anill en el caos eque el cuepro del i o el unless no coincida
## se espera una condicion falsa
## se utiliza cuanddo solo quiere evaluar una condicionj

unless true do
  IO.puts "No coincide"
end

if nil do
  IO.puts "No coincide"
else
  IO.puts "Si se ejecuta"
end

unless nil do 
  IO.puts "si se ejecuta"
else
  IO.puts "No se ejecuta"
end

if true do
  IO.puts "coincide"
else
  IO.puts "no coincide"
end

x = 2

if true do
  x = x + 2;
  IO.puts x
end
