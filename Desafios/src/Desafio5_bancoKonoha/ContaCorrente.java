package Desafio5_bancoKonoha;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente() {
    }

    @Override
    public void depositar(double valor) {
        setSaldo(valor);
        System.out.println("Valor depositado com sucesso! R$" + getSaldo());
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo Conta corrente: R$" + getSaldo());
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }
}
