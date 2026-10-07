package org.example;

public class Estagiario extends Colaborador implements Autenticavel {

    public Estagiario(String nome, String cpf, String matricula, double bolsaAuxilio) {
        super(nome, cpf, matricula, bolsaAuxilio);
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase();
    }

    @Override
    public boolean login(String usuario, String senha) {
        System.out.println(getNome() + " (Estagiário) logou no sistema de aprendizado com: " + usuario);
        return true;
    }

    @Override
    public void logout() {
        System.out.println(getNome() + " (Estagiário) deslogou do sistema de aprendizado.");
    }
}