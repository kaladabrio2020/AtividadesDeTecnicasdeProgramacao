public class Banco {
	private Conta[]  contas;
	private int index = 0;
	public Banco() {
		contas = new Conta[100];
	}
	public void cadastrar( Conta conta ) {
		contas[index] = conta;
		index ++ ;
	}

	private Conta procurar( String numero ) {
		int i = 0; boolean achou = false;

		while ( (!achou) && (i <index) ) {
			if (contas[i].getNumero().equals(numero)){
				achou = true;
			} else {
				i++;
			}
		}if ( achou ){
			return  contas[i];
		} else {
			return  null;
		}
	}

	public void creditar( String numero, double valor ) {
		Conta conta;
		conta = procurar(numero);
		if (conta != null){
			conta.creditar(valor);
		}else{
			System.out.println("Conta inexistente!");
		}
	}

	public void debitar( String numero, double valor ) {
		Conta conta ;
		conta = procurar(numero);

		if (conta != null){
			conta.creditar(valor);
		}else{
			System.out.println("Conta inexistente!");
		}
	}

	public double saldo(String numero ) {
		Conta conta ;
		conta = procurar(numero);
		if (conta != null)    return conta.getSaldo();
		else System.out.println("Conta inexistente!");
		return  0.0;
	}



	public void transferir( String origem, String destino, double valor ) {
		Conta conta_origem , conta_destino;
		conta_origem  = procurar(origem);
		conta_destino = procurar(destino);

		if ( conta_origem != null && conta_destino != null ) {
			conta_origem.debitar(valor);
			conta_destino.transferindo(valor);
		} else {
			if ( conta_origem  == null ) System.out.println("Origem invalida"+origem);
			if ( conta_destino == null ) System.out.println("Destino invalida"+destino);
		}
	}
}