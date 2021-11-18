import java.util.Vector;

public class BancoVector {
	private int index = 0;
	private double taxa_de_juros = 1.25;
	public Vector<Conta> contas;
	private Object Conta;


	public BancoVector(){ contas = new Vector<Conta>(); }


	public void cadastrar(ContaPoupanca conta){
		contas.add(conta);
		this.index+=1;
	}


	private Conta procurar(String numero){
		int i = 0;
		while (i < this.index){

			if (contas.get(i).getNumero().equals(numero))return contas.get(i);
			else                      i++;
		}return null;
	}

	public void creditar(String numero, double valor){
		Conta conta = procurar(numero);

		if ( conta != null) conta.creditar(valor);
		else                System.out.println("Conta inexistente ou nao encontrada.");
	}


	public void debitar(String numero, double valor){
		Conta conta = procurar(numero);
		if ( conta != null) conta.debitar(valor);
		else                System.out.println("Conta inexistente ou nao encontrada.");
	}


	public double saldo(String numero) {
		Conta conta = procurar(numero);
		if ( conta != null) return conta.getSaldo();
		else               System.out.println("Conta inexistente ou nao encontrada.");
		return 0.0;
	}


	public void transferir(String origem, String destino, double valor){
		Conta conta1 = procurar(origem);
		Conta conta2 = procurar(destino);

		if (conta1 != null && conta2 != null) {
			if (conta1.getSaldo()>valor) {
				conta1.debitar(valor);
				conta2.creditar(valor);
			}
		} else System.out.println(origem + " ou "+ destino + " e invalido.");
	}
	public void RenderJuros(String numero){
		Conta conta;
		conta = procurar(numero);

		if (conta != null) {
			if (Conta instanceof ContaPoupanca) ((ContaPoupanca) conta).RenderJuros(this.taxa_de_juros);
		} else               System.out.println("Nao exite ");

	}



	public void SetTaxa(double taxa_de_juros){ this.taxa_de_juros = taxa_de_juros; }
	public double GetTaxa()                  {return this.taxa_de_juros;           }

}
