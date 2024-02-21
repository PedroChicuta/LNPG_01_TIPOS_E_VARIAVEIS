mult:: Float -> Float -> Float
mult x y = x * y

main :: IO()
main = do
    putStrLn("digite a primeira nota:")
    input1 <- getLine
    let n1 = read input1 :: Float
    putStrLn("digite o primeiro peso:")
    input2 <- getLine
    let m1 = read input2 :: Float
    let val1 = mult n1 m1

    putStrLn("digite a segunda nota:")
    input3 <- getLine
    let n2 = read input3 :: Float
    putStrLn("digite o segundo peso:")
    input4 <- getLine
    let m2 = read input4 :: Float
    let val2 = mult n2 m2

    putStrLn("digite a terceira nota:")
    input5 <- getLine
    let n3 = read input5 :: Float
    putStrLn("digite o terceiro peso:")
    input6 <- getLine
    let m3 = read input6 :: Float
    let val3 = mult n3 m3
    let tot = m1 + m2 + m3
    putStrLn("A media ponderada é:" ++ show ((val1 + val2 + val3)/tot))