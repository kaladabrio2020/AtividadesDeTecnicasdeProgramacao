import java.util.Scanner;

public class Q2IF {
	public void run() {
		Scanner scn = new Scanner(System.in);
		System.out.print("1.Valor A = ");
		double valor_a = scn.nextDouble();
		System.out.print("2.Valor B = ");
		double valor_b = scn.nextDouble();
		System.out.print("Ecolha uma dessa operacoes : '+',  '-' , '/' , '*' \n=>digite aqui = ");

		char opcao = scn.next().charAt(0);

		if (opcao == '+') {
			System.out.println("Resultado : " + (valor_a + valor_b));
		} else if (opcao == '-') {
			System.out.println("Resultado : " + (valor_a - valor_b));
		} else if (opcao == '/') {
			System.out.println("Resultado : " + (valor_a / valor_b));
		} else if (opcao == '*') {
			System.out.println("Resultado : " + (valor_a * valor_b));
		} else System.out.println("Opcao invalida " + opcao);
	}
  
}