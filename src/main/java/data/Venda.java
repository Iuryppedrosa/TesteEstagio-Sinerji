package data;

import model.Vendedor;

import java.time.YearMonth;

public class Venda {
    private Vendedor vendedor;
    private YearMonth data;
    private double valor;

    public Venda(Vendedor vendedor, YearMonth data, double valor) {
        this.vendedor = vendedor;
        this.data = data;
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public YearMonth getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
}
