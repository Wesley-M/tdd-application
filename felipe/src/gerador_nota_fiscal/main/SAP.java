package gerador_nota_fiscal.main;

public class SAP {

	public void envia(NotaFiscal nf) {
		System.out.println("enviando pro sap"); 
		
		nf.setFoiEnviadaParaSAP(true);
	}

}
