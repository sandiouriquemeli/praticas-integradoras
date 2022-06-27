package desafioHeranca;

public class AppBanco {
    public static void main(String[] args) {

       Cobrador cobrador01 = new Cobrador(1L, "João Silva", 654987);
        cobrador01.fazerPagamentoDeServico();

        Executivo executivo01 = new Executivo(2L, "Pedro Silva", 987456);
        executivo01.fazerSaqueEmDinheiro();

    }
}
