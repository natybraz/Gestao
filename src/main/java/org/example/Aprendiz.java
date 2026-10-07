package org.example;

public class Aprendiz extends Colaborador {
    private int horasCumpridas;
    private int horasPrevistas;

    public Aprendiz(String nome, String cpf, String matricula, double salarioBase, int horasCumpridas, int horasPrevistas) {
        super(nome, cpf, matricula, salarioBase);
        this.horasCumpridas = horasCumpridas;
        this.horasPrevistas = horasPrevistas;
    }

    @Override
    public double calcularRemuneracao() {
        if (horasPrevistas == 0) return 0;
        return (getRemuneracaoBase() / horasPrevistas) * horasCumpridas;
    }
}