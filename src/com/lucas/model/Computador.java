package com.lucas.model;

public class Computador extends Equipamento {

    private String sistemaOperacional;

    public Computador(String nome, String numeroSerie, String responsavel, String sistemaOperacional) {
        super(nome, numeroSerie, responsavel);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Equipamento: " + nome + ", SO: " + sistemaOperacional +
                ", Nº Série: " + numeroSerie);
        mostrarResponsavel();
    }
}
