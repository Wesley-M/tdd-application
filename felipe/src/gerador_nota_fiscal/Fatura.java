package gerador_nota_fiscal;

public class Fatura {
	
	private String cliente;
	private Servico servico;
	private double valor;

	public Fatura(String cliente, String endereco, Servico servico, double valor) {
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

	public Servico getServico() {
		return this.servico;
	}

}