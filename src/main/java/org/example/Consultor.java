package org.example;

public class Consultor extends Colaborador implements Autenticavel, Remotavel {
    private double valorProjeto;

    public Consultor(String nome, String cpf, String matricula, double valorProjeto) {
        super(nome, cpf, matricula, valorProjeto);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularRemuneracao() {
        return valorProjeto;
    }

    @Override
    public boolean login(String usuario, String senha) {
        System.out.println(getNome() + " (Consultor) acessou o sistema com credenciais temporárias.");
        return true;
    }

    @Override
    public void logout() {
        System.out.println(getNome() + " (Consultor) encerrou acesso ao sistema.");
    }

    @Override
    public void iniciarJornadaRemota() {
        System.out.println(getNome() + " (Consultor) iniciou consultoria remota.");
    }

    @Override
    public void encerrarJornadaRemota() {
        System.out.println(getNome() + " (Consultor) finalizou consultoria remota.");
    }
}