import java.util.Scanner;

class Main {
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
  
    public static void testaBanco() { Scanner scn = new Scanner(System.in);
        Banco banco = new Banco();
        Conta conta = new Conta("123-43");
        banco.cadastrar(conta);

        banco.creditar("123-45", 1234.35);
        System.out.println("\n\n=123-43");
        banco.creditar("123-43", 10.50);
        System.out.println(banco.saldo("123-43"));


        System.out.println("\nCasdastrando : 1234-53");
        conta = new Conta("1234-55");
        banco.cadastrar(conta);

        System.out.println("Creditando     : 100 ");
        banco.creditar("1234-55",100.00);

        System.out.println("Transferindo 123-45 => 123-43 saldo da conta");

        banco.transferir("123-43","1234-55",10.00);
        System.out.println("Seu saldo da conta 123-43 e "+ banco.saldo("123-43"));

        System.out.println(banco);
    }

}