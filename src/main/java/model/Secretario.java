package model;

import java.time.YearMonth;

public class Secretario extends Funcionario{

    public Secretario(String nome, YearMonth dataContratacao) {
        super(nome, dataContratacao, 7000);
    }

    @Override
    public double calcularAdicional(long anosDeServico) {
        return anosDeServico * 1000;
    }

    @Override
    public double calcularSalario(YearMonth date) {
        return calcularSalarioComAdicional(date);
    }

    @Override
    public double calcularBeneficio(YearMonth date) {
        return calcularSalarioComAdicional(date) * 0.20;
    }
}
