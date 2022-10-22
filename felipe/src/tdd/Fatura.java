package tdd;

public class Fatura {
	
	private String cliente;
	private String servico;
	private double valor;

	public Fatura(String cliente, String endereco, String servico, double valor) {
		this.cliente = cliente;
		this.servico = servico;
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}

	public String getCliente() {
		return this.cliente;
	}

	public String getServico() {
		return this.servico;
	}

}
