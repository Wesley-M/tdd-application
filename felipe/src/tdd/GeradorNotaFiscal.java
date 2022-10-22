package tdd;

public class GeradorNotaFiscal {

	public NotaFiscal geraNotaFiscal(Fatura fatura) {
		
		NotaFiscal nf = new NotaFiscal(fatura.getCliente(), fatura.getValor(), fatura.getServico());
		
		return nf;
	}

	public NotaFiscal processaNotaFiscal(NotaFiscal nf) {
		NotaFiscalDao nfDao = new NotaFiscalDao();
		nfDao.salva(nf);
		nf.setFoiEnviadaPorEmail(true);
		
		return nf;		
	}

}
