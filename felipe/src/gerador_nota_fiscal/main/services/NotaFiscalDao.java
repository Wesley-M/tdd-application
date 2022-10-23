package gerador_nota_fiscal.main.services;

import gerador_nota_fiscal.main.entities.NotaFiscal;

public class NotaFiscalDao {
	public void salva(NotaFiscal nf) { 
		System.out.println("salvando no banco"); 
		
		nf.setPersistida(true);
	}
}
