idade:: Int -> Bool
idade x = x >= 18
main::IO()
main = do
    putStrLn("Digite uma Idade:")
    input <- getLine
    let num = read input :: Int
    let res = idade num
    if res
        then putStrLn("é maior de idade")
        else putStrLn("é menor de idade")