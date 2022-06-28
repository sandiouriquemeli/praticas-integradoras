package desafioBanco.Cotroller;

import desafioBanco.Entity.Cliente;
import desafioBanco.Service.Transacao;
import desafioBanco.Service.TransacaoImpl;

public class BancoController {

    private final Transacao transacao = new TransacaoImpl();

    public void fazerDeposito(Cliente cliente01) {
        if (cliente01.getTipoCliente() == 1) {
            System.out.println(transacao.fazerDeposito());
        }
    }
}
