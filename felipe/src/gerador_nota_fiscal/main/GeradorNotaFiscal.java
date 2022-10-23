package gerador_nota_fiscal.main;

public class GeradorNotaFiscal {
	
	private final static Smtp smtp = new Smtp();
	private final static NotaFiscalDao nfDao = new NotaFiscalDao();
	private final static SAP sap = new SAP();

	public NotaFiscal geraNotaFiscal(Fatura fatura) {
		
		NotaFiscal nf = new NotaFiscal(fatura.getCliente(), fatura.getValor(), fatura.getServico());
		
		return nf;
	}

	public NotaFiscal processaNotaFiscal(NotaFiscal nf) {
		smtp.envia(nf);
		sap.envia(nf);
		nfDao.salva(nf);
		
		return nf;		
	}

}
