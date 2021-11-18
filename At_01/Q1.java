import java.util.Scanner;
public class Q1 {
	public void run() {
    	Scanner scn = new Scanner(System.in);
    	System.out.print("Valor A = "); double valor_A = scn.nextDouble();
    	System.out.print("Valor B = "); double valor_B = scn.nextDouble();

    	if 		 ( valor_A > valor_B ) {
    		System.out.println( "Valor A e maior que Valor B");
    	}else if ( valor_A < valor_B ) {
      		System.out.println( "Valor B e maior que Valor A");
    	}else {
      		System.out.println( "Valor A igual a Valor B" );
    	}

  	}
}