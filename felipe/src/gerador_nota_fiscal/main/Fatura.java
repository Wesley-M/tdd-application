package gerador_nota_fiscal.main;

public class Fatura {
	
	private String cliente;
	private Servico servico;
	private String endereco;
	private double valor;

	public Fatura(String cliente, String endereco, Servico servico, double valor) throws Exception {
		
		verificaValor(valor);
		
		verificaCliente(cliente);
		
		this.cliente = cliente;
		this.servico = servico;
		this.endereco = endereco;
		this.valor = valor;
	}

	private void verificaCliente(String cliente) throws Exception {
		if (cliente == null) {
			throw new Exception("Nome não pode ser null");
		} else if (cliente.trim().equals("")) {
			throw new Exception("Nome não pode ser vazio");
		}
	}

	private void verificaValor(double valor) throws Exception {
		if (valor <= 0) {
			throw new Exception("Valor não pode ser menor ou igual a zero");
		}
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
