package model;

import java.time.YearMonth;

public class Gerente extends Funcionario{

    public Gerente(String nome, YearMonth dataContratacao) {
        super(nome, dataContratacao, 20000);
    }

    @Override
    public double calcularAdicional(long anosDeServico) {
        return anosDeServico * 3000;
    }

    @Override
    public double calcularSalario(YearMonth date) {
        return calcularSalarioComAdicional(date);
    }

    @Override
    public double calcularBeneficio(YearMonth date) {
        return 0;
    }
}
