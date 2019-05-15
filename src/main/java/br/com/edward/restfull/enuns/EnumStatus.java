package br.com.edward.restfull.enuns;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum EnumStatus {

	ABERTO, 
	FECHADO;

	@JsonCreator
	public static EnumStatus getByCodigo(String codigo) {
		return EnumStatus.valueOf(codigo);
	}
}
