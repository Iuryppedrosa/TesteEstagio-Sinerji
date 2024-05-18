package model;

import java.time.YearMonth;

public class Vendedor extends Funcionario{
    private double vendasMes;

    public Vendedor(String nome, YearMonth dataContratacao, double vendasMes) {
        super(nome, dataContratacao, 12000);
        this.vendasMes = vendasMes;
    }

    @Override
    public double calcularAdicional(long anosDeServico) {
        return anosDeServico * 1800;
    }

    @Override
    public double calcularSalario(YearMonth date) {
        return calcularSalarioComAdicional(date);
    }

    @Override
    public double calcularBeneficio(YearMonth date) {
        return vendasMes * 0.30;
    }

    public double getVendasMes() {
        return vendasMes;
    }

    public void setVendasMes(double vendasMes) {
        this.vendasMes = vendasMes;
    }
}
