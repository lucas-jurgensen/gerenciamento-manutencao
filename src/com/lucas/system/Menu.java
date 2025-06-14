package com.lucas.system;

import com.lucas.model.ArCondicionado;
import com.lucas.model.Computador;
import com.lucas.model.Equipamento;

import java.util.Scanner;

public class Menu {
    private GerenciadorDeEquipamentos gerenciador = new GerenciadorDeEquipamentos();

    public void exibir() {
        Scanner sc = new Scanner(System.in);
        OrdemDeServico ordem = new OrdemDeServico();

        while (true) {
            System.out.println("[1] - registrar computador");
            System.out.println("[2] - registrar ar condicionado");
            System.out.println("[3] - listar computadores para manutenção");
            System.out.println("[4] - listar ar condicionado para manutenção");
            System.out.println("[0] - sair do sistema");
            System.out.println("sua escolha: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                System.out.println("saindo");
                break;
            }

            switch (opcao) {
                case 1 -> {
                    Computador comp = lerDadosComputador(sc);
                    if (gerenciador.existeComputador(comp.getNumeroSerie())) {
                        System.out.println("Computador já registrado para manutenção");
                    } else {
                        gerenciador.adicionarComputador(comp);
                        System.out.println("Tipo de manutenção: ");
                        String manutencao = sc.nextLine();
                        System.out.println(ordem.registrar(comp, manutencao));
                    }
                }

                case 2 -> {
                    ArCondicionado arc = lerDadosArCondicionado(sc);
                    if (gerenciador.existeArCondicionado(arc.getNumeroSerie())) {
                        System.out.println("Ar condicionado já registrado para manuteção");
                    } else {
                        gerenciador.adicionarArCondicionado(arc);
                        System.out.println("Tipo de manutenção: ");
                        String manutencao = sc.nextLine();
                        System.out.println(ordem.registrar(arc, manutencao));
                    }
                }

                case 3 -> {
                    gerenciador.listarComputadoresManutencao();
                }

                case 4 -> {
                    gerenciador.listarArCondicionadoManutencao();
                }

                default -> {
                    System.out.println("opção invalida");
                    continue;
                }

            }
        }
        sc.close();
    }

    private Computador lerDadosComputador(Scanner sc) {
        System.out.println("Nome do computador: ");
        String nome = sc.nextLine();
        System.out.println("Número de série: ");
        String numeroSerie = sc.nextLine();
        System.out.println("Responsável: ");
        String responsavel = sc.nextLine();
        System.out.println("Sistema operacional: ");
        String so = sc.nextLine();
        return new Computador(nome, numeroSerie, responsavel, so);
    }

    private ArCondicionado lerDadosArCondicionado(Scanner sc) {
        System.out.println("Nome do Ar condicionado: ");
        String nome = sc.nextLine();
        System.out.println("Número de série: ");
        String numeroSerie = sc.nextLine();
        System.out.println("Responsável: ");
        String responsavel = sc.nextLine();
        System.out.println("Tipo de gás: ");
        String tipoGas = sc.nextLine();
        return new ArCondicionado(nome, numeroSerie, responsavel, tipoGas);
    }
}
