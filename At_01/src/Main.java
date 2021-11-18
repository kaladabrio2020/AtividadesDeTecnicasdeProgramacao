import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Escolha a questão a ser respondida.");
    	System.out.println("- 1 para Questão 1\n- 2 para Questão 2 (If)\n- 3 para Questão 2 (Switch)\n- 4 para Questão 3");
    	System.out.print("Digite a opção: ");
    	int opcao = scanner.nextInt();
    
    	switch(opcao) {
      	case 1: Q1 q1 = new Q1();
      		q1.run();
      		break;

      	case 2: Q2IF q2if = new Q2IF();
              q2if.run();
              break;

      	case 3: Q2SW q2sw = new Q2SW();
              q2sw.run();
              break;

      	case 4: Q3 q3 = new Q3();
      	      q3.run();
              break;
      	default: System.out.println("Questão inexistente!");
    	} scanner.close();
  	}
}