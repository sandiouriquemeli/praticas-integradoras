package bank;

public class Executivo extends Cliente{
    @Override
    public void consultaDeSaldo() {
        transacaoNaoOk("consulta de saldo");
    }

    @Override
    public void pagamentosDeServico() {
        transacaoNaoOk("pagamento de serviço");
    }

    @Override
    public void saqueEmDinheiro() {
        transacaoNaoOk("saque em dinheiro");
    }

    @Override
    public void deposito() {
        transacaoOk("deposito");
    }

    @Override
    public void transferencia() {
        transacaoOk("transferência");
    }
}
