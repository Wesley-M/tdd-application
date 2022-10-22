package tdd;

public class GeradorNotaFiscal {

	public NotaFiscal geraNotaFiscal(Fatura fatura) {
		
		NotaFiscal nf = new NotaFiscal(fatura.getCliente(), fatura.getValor(), fatura.getServico());
		
		return nf;
	}

	public NotaFiscal processaNotaFiscal(NotaFiscal nf) {
		NotaFiscalDao nfDao = new NotaFiscalDao();
		SAP sap = new SAP();
		
		nfDao.salva(nf);
		sap.envia(nf);
		
		nf.setFoiEnviadaPorEmail(true);
		nf.setFoiEnviadaParaSAP(true);
		
		return nf;		
	}

}
