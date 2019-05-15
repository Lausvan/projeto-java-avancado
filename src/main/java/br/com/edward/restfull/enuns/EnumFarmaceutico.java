package br.com.edward.restfull.enuns;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum EnumFarmaceutico {

    NAO_USA_NADA,
    OCULOS_GRAU,
    LENTES_GRAU,
    OCULOS_SOL,
    LENTE_BONITA,
    LENTE_BONITA_GRAU;
    
	@JsonCreator
	public static EnumFarmaceutico getByCodigo(String codigo) {
		return EnumFarmaceutico.valueOf(codigo);
	}
}
