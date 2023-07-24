isEven :: Int -> Bool
isEven x = case x of
  0 -> True
  1 -> False
  _ -> isEven (x - 2)

evenSquares :: Int -> [Int]
evenSquares n = [x^2 | x <- [1..n], isEven x]

main :: IO ()
main = do
  let result = evenSquares 10
  putStrLn $ "Even squares: " ++ show result
