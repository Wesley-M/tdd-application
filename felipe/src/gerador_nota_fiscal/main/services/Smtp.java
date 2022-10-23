package gerador_nota_fiscal.main.services;

import gerador_nota_fiscal.main.entities.NotaFiscal;

public class Smtp {

	public void envia(NotaFiscal nf) {
		System.out.println("enviando por email"); 
		
		nf.setFoiEnviadaPorEmail(true);
	}

}
