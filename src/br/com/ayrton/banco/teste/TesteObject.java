package br.com.ayrton.banco.teste;

import br.com.ayrton.banco.modelo.Cliente;
import br.com.ayrton.banco.modelo.ContaCorrente;
import br.com.ayrton.banco.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(22,33);
        Object cp = new ContaPoupanca(33,22);
        Object cliente = new Cliente();

        System.out.println(cc);
        System.out.println(cp);
    }
}
