data Forma = Circulo Float | Rectangulo Float Float

area :: Forma -> Float
area (Circulo r) = pi * r * r
area (Rectangulo w h) = w * h

main :: IO ()
main = do
  let circulo = Circulo 3.0
      rectangulo = Rectangulo 2.0 4.0
  putStrLn $ "Area del Circulo: " ++ show (area circulo)
  putStrLn $ "Area del Rectangulo: " ++ show (area rectangulo)
