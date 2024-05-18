package model;

import java.time.YearMonth;

public abstract class Funcionario {

    private String nome;
    private YearMonth dataContratacao;
    private double salarioBase;

    public Funcionario(String nome, YearMonth dataContratacao, double salarioBase) {
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public YearMonth getDataContratacao() {
        return dataContratacao;
    }

    public long getAnosDeServico(YearMonth date) {
        return date.getYear() - dataContratacao.getYear() -
                (date.getMonthValue() < dataContratacao.getMonthValue() ? 1 : 0);
    }

    public double calcularSalarioComAdicional(YearMonth date) {
        long anosDeServico = getAnosDeServico(date);
        double adicional = anosDeServico >= 1 ? calcularAdicional(anosDeServico) : 0;
        return getSalarioBase() + adicional;
    }

    public abstract double calcularAdicional(long anosDeServico);
    public abstract double calcularSalario(YearMonth date);
    public abstract double calcularBeneficio(YearMonth date);
}
