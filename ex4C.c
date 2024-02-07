#include <stdio.h>
#include <stdlib.h>

int main()
{
    int idade;
    printf("Verificador de idade\n");
    printf("Digite sua idade:");
    scanf("%d", &idade);
    if(idade >= 18){
        printf("voce e maior de idade");
    }
    else{
        printf("voce e menor de idade");
    }
    return 0;
}
