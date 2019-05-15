package br.com.edward.restfull.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.edward.restfull.enuns.EnumTipoCliente;
import br.com.edward.restfull.model.ClienteModel;
import lombok.Getter;

@Getter

@Entity
@Table(name="fornecedor")
public class Cliente extends Pessoa { 
	
	@NotNull
    @Column(name="usa_oculos")
    @Enumerated(EnumType.STRING)
    private EnumTipoCliente tipo;

	
	public Cliente(@NotNull EnumTipoCliente tipo) {
		super();
		this.tipo = tipo;
	}
	
	public Cliente(ClienteModel model) {
        super(model);
        this.tipo = model.getTipo();
    }

	 @Override
	    public Boolean getDocumentoValido() {
	        return Objects.nonNull(super.getDocumento()) && super.getDocumento().length() == 11;
	    }
}
