package gerador_nota_fiscal.main.entities;

import gerador_nota_fiscal.main.enums.Servico;

public class NotaFiscal {

	private String cliente;
	private double valor;
	private double taxa;
	
	private boolean foiEnviadaPorEmail;
	private boolean foiEnviadaParaSAP;
	private boolean persistida;
	
	public NotaFiscal(String cliente, double valor, Servico servico) {		
		this.cliente = cliente;
		this.valor = valor;
		this.foiEnviadaPorEmail = false;
		this.foiEnviadaParaSAP = false;
		this.persistida = false;

		this.calculaTaxa(servico);
	}

	private void calculaTaxa(Servico servico) {
		if (servico == Servico.CONSULTORIA) {
			this.taxa = 0.25;
		} else if (servico == Servico.TREINAMENTO) {
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

	public boolean getFoiEnviadaParaSAP() {
		return this.foiEnviadaParaSAP;
	}

	public void setFoiEnviadaParaSAP(boolean status) {
		this.foiEnviadaParaSAP = status;
	}

	public boolean getPersistida() {
		return this.persistida;
	}

	public void setPersistida(boolean status) {
		this.persistida = status;
	}

}
