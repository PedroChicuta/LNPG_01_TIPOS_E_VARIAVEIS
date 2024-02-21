converter:: Float -> Float
converter x = (x * 9/5) + 32
main::IO()
main = do
    putStrLn("Digite uma temperatura em C°:")
    input <- getLine
    let num = read input :: Float
    let res = converter num
    putStrLn(show num ++ "C° são " ++show res++"F°")