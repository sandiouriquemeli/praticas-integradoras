package bank;

public class Bank {
    public static void main(String[] args) {
        Executivo executivo = new Executivo();
        Basico basico = new Basico();
        Cobrador cobrador = new Cobrador();

        System.out.println("--Executivo--");
        executivo.consultaDeSaldo();
        executivo.deposito();
        executivo.pagamentosDeServico();
        executivo.saqueEmDinheiro();
        executivo.transferencia();

        System.out.println("--Basico--");
        basico.consultaDeSaldo();
        basico.deposito();
        basico.pagamentosDeServico();
        basico.saqueEmDinheiro();
        basico.transferencia();

        System.out.println("--Cobrador--");
        basico.consultaDeSaldo();
        basico.deposito();
        basico.pagamentosDeServico();
        basico.saqueEmDinheiro();
        basico.transferencia();
    }
}
