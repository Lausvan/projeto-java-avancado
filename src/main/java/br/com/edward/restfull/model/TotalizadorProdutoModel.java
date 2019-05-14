package br.com.edward.restfull.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class TotalizadorProdutoModel {

    private Double valorMedio;
    private Integer totalEstoque;
    private Integer qtdProduto;
    
    public TotalizadorProdutoModel(Double valorMedio, Integer totalEstoque, Integer qtdProduto) {
        this.valorMedio = valorMedio;
        this.totalEstoque = totalEstoque;
        this.qtdProduto = qtdProduto;
    }
}
