#include <stdio.h>
#include <stdlib.h>

int main()
{
    float tempC;
    printf("Celsius => Fahrenheit\n");
    printf("Digite uma temperatura em Celsius: ");
    scanf("%f", &tempC);
    float tempF = (tempC * 9/5) + 32;
    printf("%.2f graus celsius sao %.2f graus fahrenheit",tempC, tempF);
    return 0;
}
