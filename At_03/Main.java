import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha a opção desejada:\n 1) Testa BancoVector\n 2) Testa BancoArray");
    int opcao = scanner.nextInt();
    switch(opcao) {
      case 1: testaBancoVector();
              break;
              
      case 2: testaBancoArray();
              break;
              
      default: System.out.println("Opção inexistente!");
              break;
    }
    scanner.close();
  }


  public static void testaBancoVector() {
    ContaPoupanca conta;
    BancoVector bank = new BancoVector();

    conta = new ContaPoupanca("123.69");
    bank.cadastrar(conta);

    conta = new ContaPoupanca("123.45");
    bank.cadastrar(conta);

    conta = new ContaPoupanca("248.10");
    bank.cadastrar(conta);


    //creditando
    bank.creditar("248.10",12);

    bank.creditar("123.45",25);

    bank.creditar("123.69",15.50);

    //Get saldo
    System.out.println("Saldo conta 248.10 "+ bank.saldo("248.10"));
    System.out.println("Saldo conta 123.45 "+ bank.saldo("123.45"));
    System.out.println("Saldo conta 123.69 "+ bank.saldo("123.69"));

    //Render juros
    bank.SetTaxa(3.54);

    bank.RenderJuros("248.10");
    bank.RenderJuros("123.69");

    System.out.println("Saldo dps do redimendo de juros = "+ bank.saldo("248.10"));
    System.out.println("Saldo dps do redimendo de juros = "+ bank.saldo("123.69"));

    // Transferir
    bank.transferir("248.10","123.69",12);

    // Saldo e taxa

    System.out.println("taxa  = "+bank.GetTaxa());
    System.out.println("saldo = "+bank.saldo("123.69"));

  }

  public static void testaBancoArray() {
    ContaPoupanca conta ; BancoArray bank = new BancoArray();

    conta = new ContaPoupanca("12-3");  bank.cadastrar(conta);
    conta = new ContaPoupanca("12-4");  bank.cadastrar(conta);


    bank.creditar("12-3",50);
    bank.creditar("12-4",100);


    bank.debitar("12-3",0.05);
    System.out.println(bank.saldo("12-3"));

    bank.SetTaxa(0.45);
    bank.renderJuros("12-3");

    System.out.println(bank.saldo("12-3"));


  }
  
}