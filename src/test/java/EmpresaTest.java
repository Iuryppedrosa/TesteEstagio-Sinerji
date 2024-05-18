import model.Funcionario;
import model.Gerente;
import model.Secretario;
import model.Vendedor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.Empresa;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    private Empresa empresa;

    // vendedores
    private Vendedor AnaSilva;
    private Vendedor JoaoMendes;

    private Vendedor AnaSilva2;
    private Vendedor JoaoMendes2;

    private List<Funcionario> funcionarios;
    private List<Funcionario> funcionariosComBeneficios;
    private List<Vendedor> vendedores;

    private List<Funcionario> funcionarios2;
    private List<Funcionario> funcionariosComBeneficios2;
    private List<Vendedor> vendedores2;

    // secretarios
    private Secretario JorgeCarvalho;
    private Secretario MariaSilva;

    // secretario
    private List<Funcionario> funcionarios3;
    private List<Funcionario> funcionariosComBeneficios3;
    private List<Secretario> vendedores3;

    // gerentes
    private Gerente JulianaAlves;
    private Gerente BentoAlbino;

    // gerentes
    private List<Funcionario> funcionarios4;


    @BeforeEach
    void setUp() {
        empresa = new Empresa();

        //vendedores
        AnaSilva = new Vendedor("Ana Silva", YearMonth.of(2021, 12), 5200);
        JoaoMendes = new Vendedor("Joao Mendes", YearMonth.of(2021, 12), 3400);

        AnaSilva2 = new Vendedor("Ana Silva2", YearMonth.of(2022, 01), 4000);
        JoaoMendes2 = new Vendedor("Joao Mendes2", YearMonth.of(2022, 01), 7700);

        empresa.adicionarFuncionario(AnaSilva);
        empresa.adicionarFuncionario(JoaoMendes);

        empresa.adicionarFuncionario(AnaSilva2);
        empresa.adicionarFuncionario(JoaoMendes2);

        funcionarios = Arrays.asList(AnaSilva, JoaoMendes);
        funcionariosComBeneficios = Arrays.asList(AnaSilva, JoaoMendes);
        vendedores = Arrays.asList(AnaSilva, JoaoMendes);

        funcionarios2 = Arrays.asList(AnaSilva2, JoaoMendes2);
        funcionariosComBeneficios2 = Arrays.asList(AnaSilva2, JoaoMendes2);
        vendedores2 = Arrays.asList(AnaSilva2, JoaoMendes2);

        // secretarios

        JorgeCarvalho = new Secretario("Jorge Carvalho", YearMonth.of(2018, 01));
        MariaSilva = new Secretario("Maria Silva", YearMonth.of(2015, 12));

        empresa.adicionarFuncionario(JorgeCarvalho);
        empresa.adicionarFuncionario(MariaSilva);

        funcionarios3 = Arrays.asList(JorgeCarvalho, MariaSilva);
        funcionariosComBeneficios3 = Arrays.asList(JorgeCarvalho, MariaSilva);

        // gerentes
        JulianaAlves = new Gerente("Juliana Alves", YearMonth.of(2017, 07));
        BentoAlbino = new Gerente("Bento Albino", YearMonth.of(2014, 03));

        empresa.adicionarFuncionario(JulianaAlves);
        empresa.adicionarFuncionario(BentoAlbino);
        funcionarios4 = Arrays.asList(JulianaAlves, BentoAlbino);

    }

    @Test
    void totalPago() {
        double totalPago = empresa.totalPago(funcionarios, 12, 2021);
        assertEquals(26580, totalPago);
    }

    @Test
    void totalPago2() {
        double totalPago = empresa.totalPago(funcionarios2, 01, 2022);
        assertEquals(27510, totalPago);
    }

    @Test
    void totalPago3() {
        double totalPago = empresa.totalPago(funcionarios3, 12, 2021);
        assertEquals(27600, totalPago);
    }

    @Test
    void totalPago4() {
        double totalPago = empresa.totalPago(funcionarios4, 12, 2021);
        assertEquals(73000, totalPago);
    }

    @Test
    void totalPagoEmSalarios() {
        double totalPagoEmSalarios = empresa.totalPagoEmSalarios(funcionarios, 12, 2021);
        assertEquals(24000, totalPagoEmSalarios);
    }

    @Test
    void totalPagoEmSalarios2() {
        double totalPagoEmSalarios = empresa.totalPagoEmSalarios(funcionarios2, 01, 2022);
        assertEquals(24000, totalPagoEmSalarios);
    }

    @Test
    void totalPagoEmSalarios3() {
        double totalPagoEmSalarios = empresa.totalPagoEmSalarios(funcionarios3, 12, 2021);
        assertEquals(23000, totalPagoEmSalarios);
    }

    @Test
    void totalPagoEmSalarios4() {
        double totalPagoEmSalarios = empresa.totalPagoEmSalarios(funcionarios4, 12, 2021);
        assertEquals(73000, totalPagoEmSalarios);
    }

    @Test
    void totalPagoEmBeneficios() {
        double totalPagoEmBeneficios = empresa.totalPagoEmBeneficios(funcionariosComBeneficios, 12, 2021);
        assertEquals(2580, totalPagoEmBeneficios);
    }

    @Test
    void totalPagoEmBeneficios2() {
        double totalPagoEmBeneficios = empresa.totalPagoEmBeneficios(funcionariosComBeneficios2, 01, 2022);
        assertEquals(3510, totalPagoEmBeneficios);
    }

    @Test
    void totalPagoEmBeneficios3() {
        double totalPagoEmBeneficios = empresa.totalPagoEmBeneficios(funcionariosComBeneficios3, 12, 2021);
        assertEquals(4600, totalPagoEmBeneficios);
    }

    @Test
    void funcionarioComMaiorPagamento() {
        Funcionario funcionarioComMaiorPagamento = empresa.funcionarioComMaiorPagamento(funcionarios, 12, 2021);
        assertEquals("Ana Silva", funcionarioComMaiorPagamento.getNome());
    }

    @Test
    void funcionarioComMaiorPagamento2() {
        Funcionario funcionarioComMaiorPagamento = empresa.funcionarioComMaiorPagamento(funcionarios2, 01, 2022);
        assertEquals("Joao Mendes2", funcionarioComMaiorPagamento.getNome());
    }

    @Test
    void funcionarioComMaiorPagamento3() {
        Funcionario funcionarioComMaiorPagamento = empresa.funcionarioComMaiorPagamento(funcionarios3, 12, 2021);
        assertEquals("Maria Silva", funcionarioComMaiorPagamento.getNome());
    }

    @Test
    void funcionarioComMaiorPagamento4() {
        Funcionario funcionarioComMaiorPagamento = empresa.funcionarioComMaiorPagamento(funcionarios4, 12, 2021);
        assertEquals("Bento Albino", funcionarioComMaiorPagamento.getNome());
    }

    @Test
    void funcionarioComMaiorBeneficio() {
        Funcionario funcionarioComMaiorBeneficio = empresa.funcionarioComMaiorBeneficio(funcionariosComBeneficios, 12, 2021);
        assertEquals("Ana Silva", funcionarioComMaiorBeneficio.getNome());
    }

    @Test
    void funcionarioComMaiorBeneficio2() {
        Funcionario funcionarioComMaiorBeneficio = empresa.funcionarioComMaiorBeneficio(funcionariosComBeneficios2, 01, 2022);
        assertEquals("Joao Mendes2", funcionarioComMaiorBeneficio.getNome());
    }

    @Test
    void funcionarioComMaiorBeneficio3() {
        Funcionario funcionarioComMaiorBeneficio = empresa.funcionarioComMaiorBeneficio(funcionariosComBeneficios3, 12, 2021);
        assertEquals("Maria Silva", funcionarioComMaiorBeneficio.getNome());
    }

    @Test
    void vendedorQueMaisVendeu() {
        Vendedor vendedorQueMaisVendeu2 = empresa.vendedorQueMaisVendeu(vendedores2, 01, 2022);
        assertEquals("Joao Mendes2", vendedorQueMaisVendeu2.getNome());
    }

    @Test
    void vendedorQueMaisVendeu2() {
        Vendedor vendedorQueMaisVendeu = empresa.vendedorQueMaisVendeu(vendedores2, 01, 2022);
        assertEquals("Joao Mendes2", vendedorQueMaisVendeu.getNome());
    }

}