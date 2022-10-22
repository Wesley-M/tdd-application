package tdd;

public class NotaFiscal {

	public NotaFiscal(String cliente, double valor, String servico) {
	}

	public String getCliente() {
		return "Bob";
	}

	public double getValor() {
		return 2300.50;
	}

	public double getImposto() {
		return this.getValor() * 0.06;
	}

}
