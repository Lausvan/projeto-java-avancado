package br.com.edward.restfull.model;

public class FornecedorModel extends PessoaJuridicaModel{ 
	
	public FornecedorModel() {
		super();
	}

	public FornecedorModel(String nome) {
		super(nome);
	}
	
	private String representa;

	public String getRepresenta() {
		return representa;
	} 
	
	

}
