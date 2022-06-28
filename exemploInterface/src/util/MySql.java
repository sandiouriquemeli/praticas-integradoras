package util;

import modelo.Conta;

public class MySql implements BancoDeDados{
    @Override
    public void gravar(Conta conta) {
        System.out.printf("Gravando no BD MySQL a conta: %d\n", conta.getNumero());
    }
}
