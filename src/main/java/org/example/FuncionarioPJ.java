package org.example;

// Funcionario PJ: recebe valor do contrato e pode trabalhar remotamente
public class FuncionarioPJ extends Colaborador implements Remotavel {
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioPJ(String nome, String cpf, String matricula, double valorHora, double horasTrabalhadas) {
        super(nome, cpf, matricula, valorHora * horasTrabalhadas);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularRemuneracao() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public void iniciarJornadaRemota() {
        System.out.println(getNome() + " (PJ) iniciou prestação de serviço remota.");
    }

    @Override
    public void encerrarJornadaRemota() {
        System.out.println(getNome() + " (PJ) finalizou prestação de serviço remota.");
    }
}