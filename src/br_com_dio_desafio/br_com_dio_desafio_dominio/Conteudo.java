package br_com_dio_desafio.br_com_dio_desafio_dominio;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calucularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

}
