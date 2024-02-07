#include <stdio.h>
#include <stdlib.h>

int main()
{
    float nota1;
    float nota2;
    float nota3;
    float peso1;
    float peso2;
    float peso3;

    printf("Digite a primeira nota:");
    scanf("%f", &nota1);
    printf("Digite o primeiro peso:");
    scanf("%f", &peso1);

    printf("Digite a segunda nota:");
    scanf("%f", &nota2);
    printf("Digite o segunda peso:");
    scanf("%f", &peso2);

    printf("Digite a terceira nota:");
    scanf("%f", &nota3);
    printf("Digite o terceira peso:");
    scanf("%f", &peso3);

    float media = ((nota1*peso1) + (nota2 *peso2) + (nota3 *peso3))/(peso1 + peso2 + peso3);
    printf("A media das notas e %.2f", media);
    return 0;
}
