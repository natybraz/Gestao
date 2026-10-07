package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();

        colaboradores.add(new FuncionarioCLT("Carlos Silva", "111.222.333-44", "CLT001", 5000.00, 800.00));
        colaboradores.add(new FuncionarioPJ("Ana Souza", "555.666.777-88", "PJ001", 80.00, 160));
        colaboradores.add(new Estagiario("Lucas Lima", "999.888.777-66", "EST001", 1500.00));
        colaboradores.add(new Aprendiz("Beatriz Alves", "123.456.789-00", "APR001", 1200.00, 80, 100));

        colaboradores.add(new Consultor("Roberto Rocha", "444.333.222-11", "CNS001", 12000.00));

        System.out.println("=== EXIBIÇÃO DE INFORMAÇÕES E REMUNERAÇÃO ===");
        for (Colaborador c : colaboradores) {
            c.exibirInformacoes();
        }

        System.out.println("\n=== DEMONSTRAÇÃO DE CAPACIDADES ESPECÍFICAS ===");
        for (Colaborador c : colaboradores) {
            System.out.println("\n--- Checando " + c.getNome() + " ---");

            if (c instanceof Autenticavel) {
                Autenticavel aut = (Autenticavel) c;
                aut.login(c.getNome().toLowerCase().replace(" ", "."), "123456");
                aut.logout();
            } else {
                System.out.println(c.getNome() + " não possui permissão de acesso ao sistema.");
            }

            if (c instanceof Remotavel) {
                Remotavel rem = (Remotavel) c;
                rem.iniciarJornadaRemota();
                rem.encerrarJornadaRemota();
            } else {
                System.out.println(c.getNome() + " não possui autorização para trabalho remoto.");
            }
        }
    }
}