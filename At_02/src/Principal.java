import java.util.Scanner;
public class Principal {
	    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opção desejada:\n 1) Testa Claculadora\n 2) Testa Conta \n 3) Testa Banco");
        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1: testaCalculadora();
            break;

            case 2: testaConta();
            break;

            case 3: testaBanco();
            break;

            default: System.out.println("Opção inexistente!");
            break;
        }
    }

    public static void testaCalculadora() {
        Calculadora operacao = new Calculadora() ;
        double a,b; a = 2 ; b= 3.42;

        System.out.println( operacao.adcionar(a,b) );
        System.out.println( operacao.subtrair(a,b) );
        System.out.println( operacao.multiplicar(a,b) );
        System.out.println( operacao.dividir    (a,b) );
        System.out.println( operacao.potenciar(a, (int)b));
        System.out.println( operacao.coseno(a) );
        System.out.println( operacao.tagente(a));
        System.out.println( operacao.seno(a) );





    }

    public static void testaConta() {
        Conta conta  = new Conta("123-32");
        double valor = 500.87;

        conta.creditar(valor);
        System.out.println("Saldo dps de Creditar"+conta.getSaldo());


        conta.debitar(45);

        System.out.println("Saldo dps de debitado" + conta.getSaldo());


    }
    static String text = "1-Cadastrar\n2-Creditar\n3-Debitar\n4-Ver Saldo\n5-Transferir\nEscolha a opcao : ";
    public static void testaBanco() { Scanner scn = new Scanner(System.in);
	    String numero ; double valor;
    	System.out.print(text); char opcao = scn.next().charAt(0);
    	System.out.println();
	    Banco banco = new Banco();


	    switch (opcao){
	    	case '1':
		    	System.out.println("Digite o numero : "); numero = scn.next();
		    	Conta conta = new Conta(numero);
		    	banco.cadastrar(conta);
		    	break;


		    case '2':
		    	System.out.println("Digite o numero :"); numero = scn.next();
		    	System.out.println("Digite o valor  :"); valor  = scn.nextDouble();
		    	banco.creditar(numero,valor );
		    	break;

		    case '3':
		    	System.out.println("Digite o numero :"); numero = scn.nextLine();
		    	System.out.println("Digite o valor  :"); valor  = scn.nextDouble();
		    	banco.debitar(numero,valor );
		    	break;

		    case '4':
		    	System.out.println("Digite o numero :"); numero = scn.nextLine();
			    System.out.println(banco.saldo(numero ));
			    break;

		    case '5':
		    	System.out.println("Digite o numero de origem  : "); String origem  = scn.nextLine();
		    	System.out.println("Digite o numero de destino : "); String destino = scn.nextLine();
		    	System.out.println("Digite o valor             : "); valor = scn.nextDouble();
		    	banco.transferir(origem , destino , valor);
		    	break;

		    default:
		    	Principal.testaBanco();
	    }

	    ///System.out.println("Deseja continuar (s) ou (n)"); char cara = scn.next().charAt(0);

	    //if (cara == 's') Principal.testaBanco();


    }

}
