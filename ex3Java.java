package exercicio3;
import java.util.Scanner;
public class ex3Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma temperatura em celsius:");
		float temp = sc.nextFloat();
		float tempF = (temp * 9/5) + 32;
		System.out.printf("%.2f C° são %.2f °F",temp,tempF);
	}

}
