package heranca;

public class Cobrador extends Cliente{

    public Cobrador(Long id, String nome, Integer numeroConta) {
        super(id, nome, numeroConta);
    }

    @Override
    public void fazerDeposito() {
        System.out.println(transactNaoOk());
    }

    @Override
    public void fazerTransferencia() {
        System.out.println(transactNaoOk());
    }

    @Override
    public void fazerSaqueEmDinheiro() {
        System.out.println(transacaoOk());
    }

    @Override
    public void consultaSaldo() {
        System.out.println(transacaoOk());
    }

    @Override
    public void fazerPagamentoDeServico() {
        System.out.println(transacaoOk());
    }
}
