package exercicio5;
import java.util.Scanner;
public class ex5Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota:");
		int nota1 = sc.nextInt();
		System.out.print("Digite o primeiro peso:");
		int peso1 = sc.nextInt();
		
		System.out.print("Digite a segunda nota:");
		int nota2 = sc.nextInt();
		System.out.print("Digite o segunda peso:");
		int peso2 = sc.nextInt();
		
		System.out.print("Digite a terceira nota:");
		int nota3 = sc.nextInt();
		System.out.print("Digite o terceira peso:");
		int peso3 = sc.nextInt();
		
		float mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/(peso1 + peso2 + peso3);
		System.out.printf("A média ponderada é de %.2f", mediaPonderada);
	}

}

