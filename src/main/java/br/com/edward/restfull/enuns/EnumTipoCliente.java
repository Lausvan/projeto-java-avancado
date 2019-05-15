package br.com.edward.restfull.enuns;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum EnumTipoCliente {
	
	CREDIARIO,
	CONVENIO,
	TELE_ENTREGA,
	AVISTA,
	PREFERENCIAL;
	 
	
	
	@JsonCreator
	    public static EnumTipoCliente getByCodigo(String codigo) {
	        return EnumTipoCliente.valueOf(codigo);
	    }

}
