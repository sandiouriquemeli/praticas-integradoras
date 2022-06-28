package heranca;

public class AppHeranca {
    public static void main(String[] args) {

        Cobrador cobrador = new Cobrador(1L, "Eros Ourique", 789456);
        cobrador.fazerPagamentoDeServico();

        Executivo executivo = new Executivo(2L, "Sophia Ronzoni", 123456);
        executivo.fazerSaqueEmDinheiro();

        Basico basico = new Basico();
        basico.consultaSaldo();

    }
}
