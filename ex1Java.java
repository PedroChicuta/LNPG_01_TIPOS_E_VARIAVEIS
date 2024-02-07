package exercicio1;
import java.util.Scanner;
public class ex1Java{

	public static void main(String[] args) {
		System.out.println("Bem vindo a calculadora");
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero:");
		float num = sc.nextFloat();
		System.out.print("Digite outro numero:");
		float num2 = sc.nextFloat();
		System.out.println("Escolha uma operação:");
		System.out.println("1.soma");
		System.out.println("2.subtração");
		System.out.println("3.multiplicação");
		System.out.println("4.divisão");
		System.out.print("Operação desejada:");
		int op = sc.nextInt();
		
		if(op == 1) {
			System.out.printf("total: %.2f",num + num2);
		}
		else if(op == 2) {
			System.out.printf("total: %.2f",num - num2);
		}
		else if(op == 3) {
			System.out.printf("total: %.2f",num * num2);
		}
		else if(op == 4) {
			System.out.printf("total: %.2f",num / num2);
		}
		else {
			System.out.println("Opção inválida");
		}
	}
}


