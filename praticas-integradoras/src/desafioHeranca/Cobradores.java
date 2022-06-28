package desafioHeranca;

public class Cobradores extends Cliente {

    public Cobradores (Long id, String nome, Integer numeroConta){
        super (id, nome, numeroConta);
    }
    @Override
    public void  FazerDeposito (){
        System.out.println(transacaoNãOk());
    }

    @Override
    public void  fazerTransferencia (){
        System.out.println(transacaoNãOk());
    }
    @Override
    public void fazerSaqueEmDinheiro(){
        System.out.println(transacaoOk());
    }
    @Override
    public void consultaSaldo(){
        System.out.println(transacaoOk());
    }
    @Override
    public  void fazerPagamentoDeServico(){
        System.out.println(transacaoOk());
    }

    @Override
    public void fazerDeDeposito() {

    }

    @Override
    public void FazerTransferencia() {

    }

    @Override
    public void FazerSaqueEmDinheiro() {

    }

    @Override
    public void ConsultaSaldo() {

    }

    @Override
    public void fazerPagamentoDeServicos() {

    }
}
