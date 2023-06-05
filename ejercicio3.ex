### keywords  y listas
## Estructuras de datos asociativas, diccionarios, hashes, array asociativos

a = String.split("2 4     5 6"," ")
IO.inspect(a)

## cuando esta al final un argumento se puede obviar los corchetes
## acepta hasta 3 argumentos
a  = String.split("2 4 6"," ", trim: true)
IO.inspect(a)

list = [a: 1,b: 2]
IO.inspect(list)

list = list ++ [c: 3]
IO.inspect(list)

list = [z: 0] ++ list
IO.inspect(list)

IO.puts(list[:a])
IO.puts(list[:b])

new_list = [a: 0] ++ list
IO.inspect(new_list)
IO.puts(new_list[:a])

##maps
map = %{:a => 1,:b => 2}
IO.inspect(map)

IO.inspect(map[:a])
IO.inspect(map[2])

%{} = %{:a => 1, :b => 2}
%{:a => a } = %{:a => 1, :b => 2}

n = 1
map2 = %{n => :one}
IO.inspect(map2)

IO.puts(map2[n])

map3 = %{:a => 1,2 => :b}
asign = %{map3 | 2 => "two"}
IO.inspect(asign)
