package desafioHeranca;

abstract class Cliente implements Transacao {

        private Long id;
        private String nome;
        private Integer numeroConta;

        //contrutor
    public Cliente (Long id, String nome,Integer numeroConta) {
        this.id = id;
        this.nome = nome;
        this.numeroConta = numeroConta;

    }
    public Cliente() {
    }


        String transacaoOk(){
            return "Transaçao efetivada com sucesso";
        }

        String transacaoNãOk(){
            return "Transaçao não efetivada";
        }

    }
}
