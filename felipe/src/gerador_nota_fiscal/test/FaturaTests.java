package gerador_nota_fiscal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import gerador_nota_fiscal.main.entities.Fatura;
import gerador_nota_fiscal.main.enums.Servico;

public class FaturaTests {
	
	private String cliente;
	private String endereco;
	private Servico tipoServico;
	private double valorFatura;
	
	private final static double DELTA = 0;
	
	private Fatura fatura;
	
	@Before
	public void setup() throws Exception {
		this.cliente = "Bob";
		this.endereco = "Rua do Sol, 120, Centro, Rio Branco - AC";
		this.tipoServico = Servico.OUTROS;
		this.valorFatura = 2300.50;
		
		this.fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
	}
	
	@Test
	public void verificaCriacaoFatura() {
		assertEquals(cliente, fatura.getCliente());
		assertEquals(endereco, fatura.getEndereco());
		assertEquals(tipoServico, fatura.getServico());
		assertEquals(valorFatura, fatura.getValor(), DELTA);
	}
	
	@Test
	public void verificaCriarFaturaComValorNegativo() {
		try {
			valorFatura = -100;
			fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		} catch (Exception e) {
			assertEquals("Valor não pode ser menor ou igual a zero", e.getMessage());
		}
	}
	
	@Test
	public void verificaCriarFaturaComValorIgualAZero() {
		try {
			valorFatura = 0;
			fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		} catch (Exception e) {
			assertEquals("Valor não pode ser menor ou igual a zero", e.getMessage());
		}
	}
	
	@Test
	public void verificaCriarFaturaComNomeNull() {
		try {
			cliente = null;
			fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		} catch (Exception e) {
			assertEquals("Nome não pode ser null", e.getMessage());
		}
	}
	
	@Test
	public void verificaCriarFaturaComNomeVazio() {
		try {
			cliente = "";
			fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		} catch (Exception e) {
			assertEquals("Nome não pode ser vazio", e.getMessage());
		}
	}

}
