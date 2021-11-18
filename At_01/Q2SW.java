import java.util.Scanner;
public class Q2SW {
    public void run() {
        Scanner scn = new Scanner(System.in);
		System.out.print( "1.Valor A = " ); double valor_a = scn.nextDouble();
		System.out.print( "2.Valor B = " ); double valor_b = scn.nextDouble();
		System.out.print( "Ecolha uma dessa operacoes : '+',  '-' , '/' , '*' \n=>digite aqui = " );

		char opcao = scn.next().charAt(0);
		switch ( opcao ){
			case '+' : System.out.println( "Resultado : "+ (valor_a + valor_b) ); break ;
			case '-' : System.out.println( "Resultado : "+ (valor_a - valor_b) ); break ;
			case '/' : System.out.println( "Resultado : "+ (valor_a / valor_b) ); break ;
			case '*' : System.out.println( "Resultado : "+ (valor_a * valor_b) ); break ;
			default  : System.out.println( "Opcao invalida "+ opcao );
		}
    }
}