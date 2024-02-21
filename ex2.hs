checarPar :: Int -> Bool
checarPar x = (x `mod` 2) == 0

main::IO()
main = do
    putStrLn("Digite um número:")
    input <- getLine
    let num = read input :: Int
    if checarPar num
        then  putStrLn("Seu número é par") 
        else  putStrLn("Seu número é impar") 
    


