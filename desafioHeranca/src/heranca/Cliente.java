package heranca;

public abstract class Cliente implements Transacoes {

    private Long id;
    private String nome;
    private Integer numeroConta;

    public Cliente(Long id, String nome, Integer numeroConta) {
        this.id = id;
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public Cliente() {
    }

    String transacaoOk() {
        return "Transação realizada com sucesso!";
    }

    String transactNaoOk() {
        return "Tranzação não realizada!";
    }

}
