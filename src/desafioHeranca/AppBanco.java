package desafioHeranca;

public class AppBanco {
    public static void main(String[] args) {
        Basico basico1 = new Basico("Andrea", 3443, 2);
        Cobrador cobrador1 = new Cobrador("Andrea", 234, 1);

        basico1.fazerConsultaDeSaldo();
        basico1.fazerPagamentoDeServico();
        basico1.fazerDeposito();

        cobrador1.fazerSaqueEmDinheiro();
    }
}
