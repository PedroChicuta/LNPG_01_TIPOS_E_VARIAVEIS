package exercicio4;
import java.util.Scanner;
public class ex4Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma idade:");
		int idade = sc.nextInt();
		if(idade >= 18) {
			System.out.print("Maior de idade");
		}
		else {
			System.out.print("Menor de idade");
		}
	}

}
