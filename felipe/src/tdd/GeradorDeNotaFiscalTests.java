package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeradorDeNotaFiscalTests {
	
	private String cliente;
	private String endereco;
	private String tipoServico;
	private double valorFatura;
	
	@Before
	public void setup() {
		this.cliente = "Bob";
		this.endereco = "Rua do Sol, 120, Centro, Rio Branco - AC";
		this.tipoServico = "OUTROS";
		this.valorFatura = 2300.50;
	}
	
	@Test
	public void verificaImpostoNotaTipoOutros() {
		Fatura fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal();
		
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		double imposto = valorFatura * 0.06;
		
		Assert.assertTrue(nf.getCliente().equals(cliente));
		Assert.assertTrue(nf.getValor() == valorFatura);
		Assert.assertTrue(nf.getImposto() == imposto);
	}
	
	@Test
	public void verificaImpostoNotaTipoConsultoria() {
		this.tipoServico = "CONSULTORIA";
		
		Fatura fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal();
		
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		double imposto = valorFatura * 0.25;
		
		Assert.assertTrue(nf.getCliente().equals(cliente));
		Assert.assertTrue(nf.getValor() == valorFatura);
		Assert.assertTrue(nf.getImposto() == imposto);
	}
	
	@Test
	public void verificaImpostoNotaTipoTreinamento() {
		this.tipoServico = "TREINAMENTO";
		
		Fatura fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal();
		
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		double imposto = valorFatura * 0.15;
		
		Assert.assertTrue(nf.getCliente().equals(cliente));
		Assert.assertTrue(nf.getValor() == valorFatura);
		Assert.assertTrue(nf.getImposto() == imposto);
	}
	
	@Test
	public void verificaNomeDoClienteNaNota() {
		GeradorNotaFiscal gerador = new GeradorNotaFiscal();
		
		Fatura fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		Assert.assertTrue(nf.getCliente().equals(cliente));
		
		String novoCliente = "Alice";
		fatura = new Fatura(novoCliente, endereco, tipoServico, valorFatura);
		nf = gerador.geraNotaFiscal(fatura);
		
		Assert.assertEquals(novoCliente, nf.getCliente());
	}

}
