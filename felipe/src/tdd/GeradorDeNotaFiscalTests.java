package tdd;

import org.junit.Assert;
import org.junit.Test;

public class GeradorDeNotaFiscalTests {
	
	@Test
	public void verificaNotaTipoOutros() {
		String cliente = "Bob";
		String endereco = "Rua do Sol, 120, Centro, Rio Branco - AC";
		String tipoServico = "OUTROS";
		double valorFatura = 2300.50;
		
		
		Fatura fatura = new Fatura(cliente, endereco, tipoServico, valorFatura);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal();
		
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		double imposto = valorFatura * 0.06;
		
		Assert.assertTrue(nf.getCliente().equals(cliente));
		Assert.assertTrue(nf.getValor() == valorFatura);
		Assert.assertTrue(nf.getImposto() == imposto);
	}

}
