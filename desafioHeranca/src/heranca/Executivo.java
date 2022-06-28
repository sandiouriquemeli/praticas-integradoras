package heranca;

public class Executivo extends Cliente {

    public Executivo(Long id, String nome, Integer numeroConta) {
        super(id, nome, numeroConta);
    }

    @Override
    public void fazerDeposito() {
        System.out.println(transacaoOk());
    }

    @Override
    public void fazerTransferencia() {
        System.out.println(transacaoOk());
    }

    @Override
    public void fazerSaqueEmDinheiro() {
        System.out.println(transactNaoOk());
    }

    @Override
    public void consultaSaldo() {
        System.out.println(transactNaoOk());
    }

    @Override
    public void fazerPagamentoDeServico() {
        System.out.println(transactNaoOk());
    }


}
