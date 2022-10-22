package tdd;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class GeradorDeNotaFiscalTests {
	
	@Test
	public void verificaNotaTipoOutros() {
		Fatura fatura = new Fatura("Bob", "Rua do Sol, 120, Centro, Rio Branco - AC",
									"OUTROS", 2300.50);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal();
		
		NotaFiscal nf = gerador.geraNotaFiscal(fatura);
		
		double imposto = fatura.getValor() * 0.06;
		
		Assert.assertTrue(nf.getNomeDoCliente().equals(fatura.getNomeDoCliente()));
		Assert.assertTrue(nf.getValor() == fatura.getValor());
		Assert.assertTrue(nf.getImposto() == imposto);
	}

}
