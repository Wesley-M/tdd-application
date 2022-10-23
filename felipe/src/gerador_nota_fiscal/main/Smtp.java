package gerador_nota_fiscal.main;

public class Smtp {

	public void envia(NotaFiscal nf) {
		System.out.println("enviando por email"); 
		
		nf.setFoiEnviadaPorEmail(true);
	}

}
