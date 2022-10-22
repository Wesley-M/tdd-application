package gerador_nota_fiscal;

public class Fatura {
	
	private String cliente;
	private Servico servico;
	private String endereco;
	private double valor;

	public Fatura(String cliente, String endereco, Servico servico, double valor) throws Exception {
		
		if (valor <= 0) {
			throw new Exception("Valor não pode ser menor ou igual a zero");
		}
		
		this.cliente = cliente;
		this.servico = servico;
		this.endereco = endereco;
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

	public Object getEndereco() {
		return this.endereco;
	}

}
