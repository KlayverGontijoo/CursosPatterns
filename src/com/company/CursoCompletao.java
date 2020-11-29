package com.company;

public class CursoCompletao implements ProdutoCurso{
    ProdutoCurso produto1;
    ProdutoCurso produto2;
    ProdutoCurso produto3;
    Double preco;

    public CursoCompletao(ProdutoCurso produto1,ProdutoCurso produto2,ProdutoCurso produto3, Double preco){
        this.produto1=produto1;
        this.produto2=produto2;
        this.produto3=produto3;
        this.preco=preco;
    }

    @Override
    public Double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return produto1.getDescricao()+","+produto2.getDescricao()+","+"e"+ produto3.getDescricao();
    }
}
