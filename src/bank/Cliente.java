package bank;

public abstract class Cliente implements Transacoes{
    public void transacaoOk(String transacao) {
        System.out.println(transacao + " efetuado com sucesso.");
    };
    public void transacaoNaoOk(String transacao) {

        System.out.println("Esse serviço não é permitido neste tipo de conta (" + transacao + ")");
    };

}
