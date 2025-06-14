package com.lucas.system;

import com.lucas.model.ArCondicionado;
import com.lucas.model.Computador;
import com.lucas.model.Equipamento;

import java.util.Scanner;

public class Menu {
    public void exibir() {
        Scanner sc = new Scanner(System.in);
        OrdemDeServico ordem = new OrdemDeServico();

        while (true) {
            System.out.println("[1] - registrar computador");
            System.out.println("[2] - registrar ar condicionado");
            System.out.println("[0] - sair do sistema");
            System.out.println("sua escolha: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                System.out.println("saindo");
                break;
            }

            System.out.print("nome do equipamento: ");
            String nome = sc.nextLine();

            System.out.print("número de série: ");
            String numeroSerie = sc.nextLine();

            System.out.print("responsável: ");
            String responsavel = sc.nextLine();

            Equipamento equipamento = null;

            switch (opcao) {
                case 1 -> {
                    System.out.println("sistema operacional: ");
                    String so = sc.nextLine();

                    equipamento = new Computador(nome, numeroSerie, responsavel, so);
                }

                case 2 -> {
                    System.out.println("tipo de gás do ar condicionado: ");
                    String tipoGas = sc.nextLine();

                    equipamento = new ArCondicionado(nome, numeroSerie, responsavel, tipoGas);
                }

                default -> {
                    System.out.println("opção invalida");
                    continue;
                }

            }

            System.out.println("tipo de manutenção: ");
            String tipoManutecao = sc.nextLine();

            String resultado = ordem.registrar(equipamento, tipoManutecao);
            System.out.println("registro realizado");
            System.out.println(resultado);
        }

        sc.close();
    }
}
