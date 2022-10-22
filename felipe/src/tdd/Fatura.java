package tdd;

public class Fatura {
	
	private String cliente;
	private String servico;

	public Fatura(String cliente, String endereco, String servico, double valor) {
		this.cliente = cliente;
		this.servico = servico;
	}

	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCliente() {
		return this.cliente;
	}

	public String getServico() {
		return this.servico;
	}

}
