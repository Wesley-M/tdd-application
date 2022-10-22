package tdd;

public class NotaFiscal {

	private double taxa;
	
	public NotaFiscal(String cliente, double valor, String servico) {
		if (servico.equals("CONSULTORIA")) {
			this.taxa = 0.25;
		} else {
			this.taxa = 0.06;
		}
	}

	public String getCliente() {
		return "Bob";
	}

	public double getValor() {
		return 2300.50;
	}

	public double getImposto() {
		return this.getValor() * this.taxa;
	}

}
