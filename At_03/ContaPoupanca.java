public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numero) {
		super(numero);
	}
	public void RenderJuros(double taxa_de_juros) {
		creditar(getSaldo()*taxa_de_juros);
	}
}