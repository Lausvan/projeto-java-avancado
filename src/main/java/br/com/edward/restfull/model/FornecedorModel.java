package br.com.edward.restfull.model;

import br.com.edward.restfull.domain.Fornecedor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class FornecedorModel extends PessoaModel {

    private String razaoSocial;

    public FornecedorModel(Fornecedor domain) {
        super(domain);
        this.razaoSocial = domain.getRazaoSocial();
    }
}
