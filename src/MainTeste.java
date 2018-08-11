import java.util.Scanner;

public class MainTeste {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int number1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor");
		int number2 = scan.nextInt();
		
		int soma = number1 + number2;
		
		System.out.println("A soma dos valores será de " + soma);		
		
	}
}
