## programa que convierte segundos a horas

segs = 3600
seg_to_hrs = fn (seg) ->  trunc seg / segs end
hora = seg_to_hrs.(segs)
IO.puts "#{segs} segundos son #{hora} hora/s"
