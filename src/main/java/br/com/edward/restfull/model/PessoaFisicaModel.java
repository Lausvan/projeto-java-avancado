package br.com.edward.restfull.model;

public abstract class PessoaFisicaModel extends PessoaModel{ 
	
	private Boolean usaCoculos; 
	
	public PessoaFisicaModel() {
		super();
	}

	public PessoaFisicaModel(String nome) {
		super(nome);
	}

	@Override
	public boolean getDocumentacaoValida() {
		if(super.getDocumento().length() == 11 && super.getDocumento() != null) {
			return true;
		}
		return false;
	}

	public boolean isUsaCoculos() {
		return usaCoculos;
	} 

}
