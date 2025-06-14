package com.lucas.system;

import com.lucas.model.Equipamento;

public class OrdemDeServico {

    String tipoManutencao;

    public String registrar(Equipamento equipamento, String tipoManutencao) {
        return "Equipamento: " + equipamento.nome + ", N de série: " + equipamento.getNumeroSerie() +
                " registrado com manutenção: " + tipoManutencao;
    }
}
