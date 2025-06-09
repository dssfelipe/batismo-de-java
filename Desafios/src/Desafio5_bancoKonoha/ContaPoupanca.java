package Desafio5_bancoKonoha;

public class ContaPoupanca extends ContaBancaria {



    @Override
    public void depositar(double valor) {
        setSaldo(valor*0.99);
        System.out.println("Valor depositado com sucesso! R$" + valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo Conta poupança: R$" + getSaldo());
    }

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

}
