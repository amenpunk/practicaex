numberList :: Int -> [Int]
numberList n = take n [1..]

main :: IO ()
main = do
  let myList = numberList 5
  putStrLn $ "La lista es: " ++ show myList
