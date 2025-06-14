package com.lucas.model;

public abstract class Equipamento {

    public String nome;
    protected String numeroSerie;
    private String responsavel;

    public Equipamento(String nome, String numeroSerie, String responsavel) {
        this.nome = nome;
        this.numeroSerie = numeroSerie;
        this.responsavel = responsavel;
    }

    public abstract void exibirInformacoes();

    public void mostrarResponsavel() {
        System.out.println("Responsavel: " + responsavel);
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
