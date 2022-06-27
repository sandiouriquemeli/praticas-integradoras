package bank;

public class Basico extends Cliente{
    @Override
    public void consultaDeSaldo() {
        transacaoOk("consulta de saldo");
    }

    @Override
    public void pagamentosDeServico() {
        transacaoOk("pagamento de serviço");
    }

    @Override
    public void saqueEmDinheiro() {
        transacaoOk("saque em dinheiro");
    }

    @Override
    public void deposito() {
        transacaoNaoOk("deposito");
    }

    @Override
    public void transferencia() {
        transacaoNaoOk("transferência");

    }
}
