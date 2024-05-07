package org.example;

import java.util.Scanner;

public class ContaTerminal {
    int numero ;
    String agencia;
    String nomeCliente ;
    Double saldo;

        public void receberDados(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o número da Agência:");
            this.agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            this.numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            this.nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo:");
            this.saldo = scanner.nextDouble();

            scanner.close();
        }

    public void exibirMensagem() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.");
    }

}
