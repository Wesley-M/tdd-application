package tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GeradorDeNotaFiscalTests {
	
	private String cliente;
	private String endereco;
	private Servico tipoServico;
	private double valorFatura;
	private double imposto;
	private GeradorNotaFiscal gerador;
	private Fatura fatura;
	private final static double DELTA = 0;
	private final static double TAXA_CONSULTORIA = 0.25;
	private final static double TAXA_TREINAMENTO = 0.15;
	private final static double TAXA_OUTROS = 0.06;
	
	@Before
	public void setup() {
		this.cliente = "Bob";
		this.endereco = "Rua do Sol, 120, Centro, Rio Branco - AC";
		this.tipoServico = Servico.OUTROS;
		this.valorFatura = 2300.50;
		this.imposto = valorFatura * TAXA_OUTROS;
		this.fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		this.gerador = new GeradorNotaFiscal();
	}
	
	@Test
	public void verificaImpostoNotaTipoOutros() {
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		assertEquals(cliente, nf.getCliente());
		assertEquals(valorFatura, nf.getValor(), DELTA);
		assertEquals(imposto, nf.getImposto(), DELTA);
	}
	
	@Test
	public void verificaImpostoNotaTipoConsultoria() {
		this.tipoServico = Servico.CONSULTORIA;
		
		fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		imposto = valorFatura * TAXA_CONSULTORIA;
		
		assertEquals(cliente, nf.getCliente());
		assertEquals(valorFatura, nf.getValor(), DELTA);
		assertEquals(imposto, nf.getImposto(), DELTA);
	}
	
	@Test
	public void verificaImpostoNotaTipoTreinamento() {
		this.tipoServico = Servico.TREINAMENTO;
		
		fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		imposto = valorFatura * TAXA_TREINAMENTO;
		
		assertEquals(cliente, nf.getCliente());
		assertEquals(valorFatura, nf.getValor(), DELTA);
		assertEquals(imposto, nf.getImposto(), DELTA);
	}
	
	@Test
	public void verificaNomeDoClienteNaNota() {
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		assertEquals(cliente, nf.getCliente());
		
		String novoCliente = "Alice";
		fatura = new Fatura(novoCliente, endereco, tipoServico, valorFatura);
		nf = gerador.geraNotaFiscal(fatura);
		
		assertEquals(novoCliente, nf.getCliente());
	}
	
	@Test
	public void verificaValorDaNota() {
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		assertEquals(valorFatura, nf.getValor(), DELTA);
		
		double novoValorFatura = 1300.22;
		fatura = new Fatura(cliente, endereco, tipoServico, novoValorFatura);
		nf = gerador.geraNotaFiscal(fatura);
		
		assertEquals(novoValorFatura, nf.getValor(), DELTA);
	}
	
	@Test
	public void verificaEnvioEmail() {
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		assertFalse(nf.getFoiEnviadaPorEmail());
		
		nf = gerador.processaNotaFiscal(nf);
		
		assertTrue(nf.getFoiEnviadaPorEmail());
	}
	
	@Test
	public void verificaEnvioSAP() {
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		assertFalse(nf.getFoiEnviadaParaSAP());
		
		nf = gerador.processaNotaFiscal(nf);
		
		assertTrue(nf.getFoiEnviadaParaSAP());
	}
	
	@Test
	public void verificaPersistenciaNoBD() {
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		assertFalse(nf.getPersistida());
		
		nf = gerador.processaNotaFiscal(nf);
		
		assertTrue(nf.getPersistida());
	}

}
