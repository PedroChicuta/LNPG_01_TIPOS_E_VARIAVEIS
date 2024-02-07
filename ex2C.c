#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("PAR X IMPAR\n");
    printf("Digite um numero:");
    int numUser;
    scanf("%d", &numUser);
    if(numUser%2 == 0){
        printf("%d e par", numUser);
    }
    else{
        printf("%d e impar", numUser);
    }
    return 0;
}
