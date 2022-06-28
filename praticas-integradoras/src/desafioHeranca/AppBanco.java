package desafioHeranca;

public class AppBanco {
    public static void main (String [] args){

        Cobradores cobrador01 =  new Cobradores( 1L,"Karina Lima",12345);
        cobrador01.fazerPagamentoDeServico();

        Executivo executivo02 = new Executivo( 2L,"Maria Silva",9876);
        executivo02.fazerSaqueEmDinheiro();

        Basico basico03 = new Basico();
        basico03.consultaSaldo();
    }

}
