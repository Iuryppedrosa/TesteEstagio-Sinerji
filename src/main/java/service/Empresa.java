package service;

import data.Venda;
import model.Funcionario;
import model.Vendedor;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;
    private List<Venda> vendas;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    private void atualizarVendasMes(YearMonth data) {
        for (Venda venda : vendas) {
            if (venda.getData().equals(data)) {
                venda.getVendedor().setVendasMes(venda.getValor());
            }
        }
    }

    public double totalPago(List<Funcionario> funcionarios, int mes, int ano) {
        YearMonth data = YearMonth.of(ano, mes);
        atualizarVendasMes(data);
        return funcionarios.stream()
                .mapToDouble(f -> f.calcularSalario(data) + f.calcularBeneficio(data))
                .sum();
    }

    public double totalPagoEmSalarios(List<Funcionario> funcionarios, int mes, int ano) {
        YearMonth data = YearMonth.of(ano, mes);
        atualizarVendasMes(data);
        return funcionarios.stream()
                .mapToDouble(f -> f.calcularSalario(data))
                .sum();
    }

    public double totalPagoEmBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        YearMonth data = YearMonth.of(ano, mes);
        atualizarVendasMes(data);
        return funcionarios.stream()
                .mapToDouble(f -> f.calcularBeneficio(data))
                .sum();
    }

    public Funcionario funcionarioComMaiorPagamento(List<Funcionario> funcionarios, int mes, int ano) {
        YearMonth data = YearMonth.of(ano, mes);
        atualizarVendasMes(data);
        return funcionarios.stream()
                .max(Comparator.comparingDouble(f -> f.calcularSalario(data) + f.calcularBeneficio(data)))
                .orElse(null);
    }

    public Funcionario funcionarioComMaiorBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
        YearMonth data = YearMonth.of(ano, mes);
        atualizarVendasMes(data);
        return funcionarios.stream()
                .filter(f -> f.calcularBeneficio(data) > 0)
                .max(Comparator.comparingDouble(f -> f.calcularBeneficio(data)))
                .orElse(null);
    }

    public Vendedor vendedorQueMaisVendeu(List<Vendedor> vendedores, int mes, int ano) {
        YearMonth data = YearMonth.of(ano, mes);
        atualizarVendasMes(data);
        return vendedores.stream()
                .max(Comparator.comparingDouble(Vendedor::getVendasMes))
                .orElse(null);
    }
}
