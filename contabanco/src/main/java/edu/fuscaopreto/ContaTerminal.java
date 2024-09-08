package edu.fuscaopreto;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomecliente;
        Double saldo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Digite a agência: ");
        agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        nomecliente = scanner.next();
        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Ola " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque"); 

    }
}