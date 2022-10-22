package tdd;

public class GeradorNotaFiscal {

	public NotaFiscal geraNotaFiscal(Fatura fatura) {
		
		NotaFiscal nf = new NotaFiscal(fatura.getCliente(), fatura.getValor(), fatura.getServico());
		
		return nf;
	}

	public NotaFiscal processaNotaFiscal(NotaFiscal nf) {
		Smtp smtp = new Smtp();
		NotaFiscalDao nfDao = new NotaFiscalDao();
		SAP sap = new SAP();
		
		smtp.envia(nf);
		sap.envia(nf);
		nfDao.salva(nf);
		
		nf.setFoiEnviadaPorEmail(true);
		nf.setFoiEnviadaParaSAP(true);
		nf.setPersistida(true);
		
		return nf;		
	}

}
