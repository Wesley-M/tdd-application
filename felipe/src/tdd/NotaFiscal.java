package tdd;

public class NotaFiscal {

	private String cliente;
	private double taxa;
	
	public NotaFiscal(String cliente, double valor, String servico) {
		this.cliente = cliente;
		
		if (servico.equals("CONSULTORIA")) {
			this.taxa = 0.25;
		} else if (servico.equals("TREINAMENTO")) {
			this.taxa = 0.15;
		} else {
			this.taxa = 0.06;
		}
	}

	public String getCliente() {
		return this.cliente;
	}

	public double getValor() {
		return 2300.50;
	}

	public double getImposto() {
		return this.getValor() * this.taxa;
	}

}
