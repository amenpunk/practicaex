agregar_dos_numeros x y = x + y

main :: IO ()
main = do
  let result = agregar_dos_numeros 3 3
  putStrLn $ "El resultado es: " ++ show result
