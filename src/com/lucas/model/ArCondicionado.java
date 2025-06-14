package com.lucas.model;

public class ArCondicionado extends Equipamento {

    private String tipoDeGas;

    public ArCondicionado(String nome, String numeroSerie, String responsavel, String tipoDeGas) {
        super(nome, numeroSerie, responsavel);
        this.tipoDeGas = tipoDeGas;
    }

    public String getTipoDeGas() {
        return tipoDeGas;
    }

    public void setTipoDeGas(String tipoDeGas) {
        this.tipoDeGas = tipoDeGas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Equipamento: " + nome + ", Tipo de gás: " + tipoDeGas +
                ", Nº Série: " + numeroSerie);
        mostrarResponsavel();
    }
}
