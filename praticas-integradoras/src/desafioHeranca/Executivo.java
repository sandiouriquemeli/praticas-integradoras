package desafioHeranca;

public class Executivo  extends Cliente{

    public Executivo (Long id, String nome, Integer numeroConta) {

        super(id,nome,numeroConta);
    }
        @Override
        public void fazerDeposito() {
            System.out.println(transacaoOk());
        }
        @Override
        public void fazerTransferencia(){
        System.out.println(transacaoOk());
        }

        @Override
        public void fazerSaqueEmDinheiro(){
        System.out.println(transacaoNãOk());
        }

        @Override
        public void consultaSaldo(){
        System.out.println(transacaoNãOk());
        }

        @Override
        public void fazerpagamentoDeServico(){
        System.out.println(transacaoNãOk());
        }
}
