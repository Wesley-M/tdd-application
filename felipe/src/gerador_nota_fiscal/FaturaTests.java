package gerador_nota_fiscal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FaturaTests {
	
	private String cliente;
	private String endereco;
	private Servico tipoServico;
	private double valorFatura;
	
	private final static double DELTA = 0;
	
	private Fatura fatura;
	
	@Before
	public void setup() {
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

}
