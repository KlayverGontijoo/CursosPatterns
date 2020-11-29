package com.company;

public class CursoSimples implements ProdutoCurso {
    private String descricao;
    private Double preco;

    public CursoSimples(String descricao,Double preco){
        this.descricao=descricao;
        this.preco=preco;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
}
