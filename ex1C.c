#include <stdio.h>
#include <stdlib.h>

int main()
{
    int op;
    float num2;
    float num1;

    printf("Bem vindo a calculadora:\n");

    printf("Digite um numero:");
    scanf("%f", &num1);

    printf("Digite outro numero:");
    scanf("%f", &num2);

    printf("1.soma\n2.subtracao \n3.multiplicacao \n4.divisao\n");


    while(1){
        printf("Ecolha uma operacao desejada: ");
        scanf("%i", &op);
        if(op <=4){
            break;
        }
    }
    if(op == 1){
       printf("A soma e:%.2f", num1 + num2);
    }
    else if(op == 2){
       printf("A subtracao e: %.2f", num1 - num2);
    }
    else if(op == 3){
       printf("A multiplicao e: %.2f", num1 * num2);
    }
    else if(op == 4){
       printf("A divisao e: %.2f", num1 / num2);
    }

    return 0;
}
