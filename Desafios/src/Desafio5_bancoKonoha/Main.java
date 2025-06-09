package Desafio5_bancoKonoha;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        ContaCorrente contaCorrente1 = new ContaCorrente();

        contaPoupanca1.depositar(500);
        contaPoupanca1.consultarSaldo();

        contaCorrente1.depositar(1000);
        contaCorrente1.consultarSaldo();

    }
}
