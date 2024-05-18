import model.Funcionario;
import model.Vendedor;
import service.Empresa;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Vendedor AnaSilva = new Vendedor("Ana Silva", YearMonth.of(2021, 12), 5200);
        Vendedor JoaoMendes = new Vendedor("Joao Mendes", YearMonth.of(2021, 12), 3400);

        empresa.adicionarFuncionario(AnaSilva);
        empresa.adicionarFuncionario(JoaoMendes);

        List<Funcionario> funcionarios = Arrays.asList(AnaSilva, JoaoMendes);
        List<Funcionario> funcionariosComBeneficios = Arrays.asList(AnaSilva, JoaoMendes);
        List<Vendedor> vendedores = Arrays.asList(AnaSilva, JoaoMendes);

        int mes = 12;
        int ano = 2021;

        double totalPago = empresa.totalPago(funcionarios, mes, ano);
        System.out.println("Total pago no mês: " + totalPago);

        System.out.println("Total pago em salários no mês: " + empresa.totalPagoEmSalarios(funcionarios, mes, ano));
        System.out.println("Total pago em benefícios no mês: " + empresa.totalPagoEmBeneficios(funcionariosComBeneficios, mes, ano));
        System.out.println("Funcionário com maior pagamento no mês: " + empresa.funcionarioComMaiorPagamento(funcionarios, mes, ano).getNome());
        System.out.println("Funcionário com maior benefício no mês: " + empresa.funcionarioComMaiorBeneficio(funcionariosComBeneficios, mes, ano).getNome());
        System.out.println("model.Vendedor que mais vendeu no mês: " + empresa.vendedorQueMaisVendeu(vendedores, mes, ano).getNome());
    }
}
