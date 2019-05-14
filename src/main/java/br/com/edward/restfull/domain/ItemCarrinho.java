package br.com.edward.restfull.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class ItemCarrinho {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@Column(name="qtd")
	private Integer qtd;
	
	@NotNull
	@Column(name="produto")
    private Produto produto;
	
	@NotNull
	@Column(name="carrinho")
    private Carrinho carrinho;
    
    public ItemCarrinho(Integer qtd, Produto produto) {
        this();
        this.qtd = qtd;
        this.produto = produto;
    }

    public Double getTotal() {
        return this.qtd * this.produto.getPreco();
    }
}
