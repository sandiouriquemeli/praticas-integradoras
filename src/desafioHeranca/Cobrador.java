package desafioHeranca;

public class Cobrador extends Cliente{
    public Cobrador(String nome, long id, int numeroDeConta) {
        super(nome, id, numeroDeConta);
    }

    @Override
    void transacoesOk() {
        System.out.println("Transacao efetivada com sucesso nivel Cobrador");
    }

    @Override
    void transacoesNaoOk() {
        System.out.println("Transacao nao foi efetivada nivel Cobrador");
    }

    @Override
    public void fazerSaqueEmDinheiro() {
        transacoesNaoOk();
    }

    @Override
    public void fazerConsultaDeSaldo() {
        transacoesOk();
    }

    @Override
    public void fazerDeposito() {
        System.out.println("Voce nao pode fazer este tipo de transacao");
    }

    @Override
    public void fazerTransferencia() {
        System.out.println("Voce nao pode fazer este tipo de transacao");
    }

    @Override
    public void fazerPagamentoDeServico() {
        System.out.println("Voce nao pode fazer este tipo de transacao");
    }
}
