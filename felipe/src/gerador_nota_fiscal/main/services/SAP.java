package gerador_nota_fiscal.main.services;

import gerador_nota_fiscal.main.entities.NotaFiscal;

public class SAP {

	public void envia(NotaFiscal nf) {
		System.out.println("enviando pro sap"); 
		
		nf.setFoiEnviadaParaSAP(true);
	}

}
