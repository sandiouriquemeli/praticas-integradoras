package heranca;

public class Basico extends Cliente{

    public Basico(Long id, String nome, Integer numeroConta) {
        super(id, nome, numeroConta);
    }

    public Basico() {

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
