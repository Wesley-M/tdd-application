package gerador_nota_fiscal.main;

public class NotaFiscalDao {
	public void salva(NotaFiscal nf) { 
		System.out.println("salvando no banco"); 
		
		nf.setPersistida(true);
	}
}
