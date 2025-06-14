package com.lucas.system;

import com.lucas.model.ArCondicionado;
import com.lucas.model.Computador;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEquipamentos {

    List<Computador> computadorList = new ArrayList<>();
    List<ArCondicionado> arCondicionadoList = new ArrayList<>();

    protected void listarComputadoresManutencao() {
        if (computadorList.isEmpty()) {
            System.out.println("Não há computadores para manutenção");
            return;
        }

        for (Computador comp : computadorList) {
            System.out.println("Equipamento: " + comp.nome + " - Núm. Série: " + comp.getNumeroSerie() +
                    " - SO: " + comp.getSistemaOperacional() + " - Responsável: " + comp.getResponsavel());
        }
    }

    protected boolean existeComputador(String numeroSerie) {
        for (Computador comp : computadorList) {
            if (comp.getNumeroSerie().equals(numeroSerie)) {
                return true;
            }
        }
        return false;
    }

    protected boolean adicionarComputador(Computador novoComputador) {
        boolean exist = existeComputador(novoComputador.getNumeroSerie());

        if (exist) {
            System.out.println("Computador já esta registrado para manutenção");
            return false;
        }

        computadorList.add(novoComputador);
        return true;
    }

    protected void listarArCondicionadoManutencao() {
        if (arCondicionadoList.isEmpty()) {
            System.out.println("Não há Ar Condicionado para manutenção");
            return;
        }

        for (ArCondicionado arc : arCondicionadoList) {
            System.out.println("Equipamento: " + arc.nome + " - Núm. Série: " + arc.getNumeroSerie() +
                    " - Tipo de Gás: " + arc.getTipoDeGas() + " - Responsável: " + arc.getResponsavel());
        }
    }

    protected boolean existeArCondicionado(String numeroSerie) {
        for (ArCondicionado arc : arCondicionadoList) {
            if (arc.getNumeroSerie().equals(numeroSerie)) {
                return true;
            }
        }
        return false;
    }

    protected boolean adicionarArCondicionado(ArCondicionado novoArCondicionado) {
        boolean exist = existeArCondicionado(novoArCondicionado.getNumeroSerie());

        if (exist) {
            System.out.println("Ar Condicionado já esta registrado para manutenção");
            return false;
        }

        arCondicionadoList.add(novoArCondicionado);
        return true;
    }
}