package br.com.edward.restfull.model;

public abstract class PessoaJuridicaModel extends PessoaModel{ 
	
	private String razaoSocial; 
	
	public PessoaJuridicaModel() {
		super();
	}

	public PessoaJuridicaModel(String nome) {
		super(nome);
	}

	@Override
	public boolean getDocumentacaoValida() {
		if(super.getDocumento().length() == 14 && super.getDocumento() != null) {
			return true;
		}
		return false;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	

}
