package desafioHeranca;

public class Basico extends Cliente {

    public Basico (Long id, String nome, Integer numeroConta) {
        super(id, nome, numeroConta);
    }

    public Basico(){

    }
    @Override
    public void fazerDeposito(){
        System.out.println(transacaoNãOk());
    }
    @Override
    public void fazerTransferencia(){
        System.out.println(transacaoOk());
    }
    @Override
    public void fazerSaqueEmDinheiro() {
        System.out.println(transacaoOk());
    }
    @Override
    public void consultaSaldo(){
        System.out.println(transacaoOk());
    }
    @Override
    public void fazerPagamentoDeServico(){
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
