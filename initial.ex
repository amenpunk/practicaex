# tipos de datos
# 34 enteros
# 34.4 Decimales o flotantes
# false booleanos
# [1,2,3] listas
# {2,4,5} tuplas
# :atom
# "string" cadenas

IO.puts(30 + 56)
IO.puts(59/4)
IO.puts(div(59,4))
IO.puts(rem(7,5))
IO.puts(round(45.78))
IO.puts(trunc(56.8))

a = true == false
b = true == true

IO.puts(a)
IO.puts(is_boolean(b))
IO.puts(is_number(34))

IO.puts(:aa == :bb)
IO.puts(is_atom(:ff))


greating = :world
message = "hello #{greating}"

IO.puts(message)
IO.puts(String.length(message))
IO.puts(String.upcase(message))

add = fn a,b -> a + b end
sum = add.(1 , 2)
IO.puts(sum)
IO.puts(is_function(add))

l = [1,2,3,4,5]
o = [6,7,8,9,10,3]
c = l++o
IO.inspect(l ++ o)
IO.inspect(l -- o)

k = [1,true,2,false,true] -- [true,false]
IO.inspect(k)
t = { :ok, "hello" }
IO.inspect(t)
IO.puts(tuple_size(t))

IO.puts(elem(t,0))
IO.puts(elem t,1)
IO.inspect( put_elem t,1,:world )

## parte dos
{a,b,c} = {:hello,"world", 99}
IO.inspect([ a,b,c ])

[head | tail] = l
#
IO.inspect(head)
IO.inspect(tail)
#
#
