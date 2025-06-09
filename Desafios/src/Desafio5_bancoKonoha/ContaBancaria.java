package Desafio5_bancoKonoha;

public abstract class ContaBancaria implements Conta{

    private double saldo;

    @Override
    public abstract void consultarSaldo();

    @Override
    public abstract void depositar(double valor);

    public ContaBancaria(){

    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
