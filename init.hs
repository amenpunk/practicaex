main :: IO ()

main = do
    IO.putStrLn "Hello, what's your name?"
    name <- getLine
    IO.putStrLn ("Hey " ++ name ++ ", you rock!")
