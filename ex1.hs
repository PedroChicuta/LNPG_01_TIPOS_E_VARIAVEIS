soma :: Float -> Float -> Float
soma x y = x + y


subtracao:: Float-> Float -> Float
subtracao a b = a - b

multiplicacao:: Float-> Float -> Float
multiplicacao a b = a * b

divisao:: Float-> Float -> Float
divisao a b = a / b


main :: IO()
main = do
    putStrLn("Digite um numero:")
    input <- getLine
    let num1 = read input :: Float 
    putStrLn("Digite outro numero:")
    input2 <- getLine
    let num2 = read input2 :: Float 
    putStrLn ("A soma dos numeros é " ++ show (soma num1 num2))
    putStrLn ("A subtração dos numeros é " ++ show (subtracao num1 num2))
    putStrLn ("A multiplicação dos numeros é " ++ show (multiplicacao num1 num2))
    putStrLn ("A divisão dos numeros é " ++ show (divisao num1 num2))


