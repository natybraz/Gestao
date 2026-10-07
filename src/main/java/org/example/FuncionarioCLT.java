package org.example;


public class FuncionarioCLT extends Colaborador implements Autenticavel, Remotavel {
    private double valorBeneficios;

    public FuncionarioCLT(String nome, String cpf, String matricula, double salario, double valorBeneficios) {
        super(nome, cpf, matricula, salario);
        this.valorBeneficios = valorBeneficios;
    }

    @Override
    public double calcularRemuneracao() {
        return getRemuneracaoBase() + valorBeneficios;
    }

    @Override
    public boolean login(String usuario, String senha) {
        System.out.println(getNome() + " (CLT) logou no sistema interno com usuário: " + usuario);
        return true;
    }

    @Override
    public void logout() {
        System.out.println(getNome() + " (CLT) deslogou do sistema.");
    }

    @Override
    public void iniciarJornadaRemota() {
        System.out.println(getNome() + " (CLT) iniciou o trabalho remoto via VPN.");
    }

    @Override
    public void encerrarJornadaRemota() {
        System.out.println(getNome() + " (CLT) encerrou o trabalho remoto.");
    }
}