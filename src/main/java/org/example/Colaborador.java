package org.example;

public abstract class Colaborador {
    private String nome;
    private String cpf;
    private String matricula;
    private double remuneracaoBase;

    public Colaborador(String nome, String cpf, String matricula, double remuneracaoBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.remuneracaoBase = remuneracaoBase;
    }

    // Método abstrato: cada tipo de colaborador calcula sua remuneração de forma específica
    public abstract double calcularRemuneracao();

    public void exibirInformacoes() {
        System.out.println("----------------------------------------");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Remuneração Calculada: R$ " + String.format("%.2f", calcularRemuneracao()));
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getMatricula() { return matricula; }
    public double getRemuneracaoBase() { return remuneracaoBase; }
    public void setRemuneracaoBase(double remuneracaoBase) { this.remuneracaoBase = remuneracaoBase; }
}