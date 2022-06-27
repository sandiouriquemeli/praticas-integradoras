package desafioHeranca;

abstract class Cliente implements Transacao {
    private String nome;
    private long id;
    private int numeroDeConta;

    public Cliente(String nome, long id, int numeroDeConta) {
        this.nome = nome;
        this.id = id;
        this.numeroDeConta = numeroDeConta;
    }

    abstract void transacoesOk();
    abstract void transacoesNaoOk();
}
