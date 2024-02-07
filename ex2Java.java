package exercicio2;
import java.util.Scanner;
public class ex2Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.printf("%d é par", num);
		}
		else {
			System.out.printf("%d é impar", num);
		}
		

	}

}
