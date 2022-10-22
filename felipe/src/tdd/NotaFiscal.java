package tdd;

public class NotaFiscal {

	private String cliente;
	private double valor;
	private double taxa;
	private boolean foiEnviadaPorEmail;
	
	public NotaFiscal(String cliente, double valor, String servico) {
		this.cliente = cliente;
		this.valor = valor;
		this.foiEnviadaPorEmail = false;
		
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
		return this.valor;
	}

	public double getImposto() {
		return this.getValor() * this.taxa;
	}

	public boolean getFoiEnviadaPorEmail() {
		return this.foiEnviadaPorEmail;
	}

	public void setFoiEnviadaPorEmail(boolean status) {
		this.foiEnviadaPorEmail = status;
	}

}