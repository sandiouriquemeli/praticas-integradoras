package desafioHeranca;

public class Executivo extends Cliente{

    public Executivo(String nome, long id, int numeroDeConta) {
        super(nome, id, numeroDeConta);
    }

    @Override
    void transacoesOk() {
        System.out.println("Transacao efetivada com sucesso nivel Executivo");
    }

    @Override
    void transacoesNaoOk() {
        System.out.println("Transacao nao foi efetivada nivel Executivo");
    }

    @Override
    public void fazerDeposito() {
        transacoesOk();
    }

    @Override
    public void fazerTransferencia() {
        transacoesNaoOk();
    }

    @Override
    public void fazerSaqueEmDinheiro() {
        System.out.println("Voce nao pode fazer este tipo de transacao");
    }

    @Override
    public void fazerConsultaDeSaldo() {
        System.out.println("Voce nao pode fazer este tipo de transacao");
    }

    @Override
    public void fazerPagamentoDeServico() {
        System.out.println("Voce nao pode fazer este tipo de transacao");
    }
}
