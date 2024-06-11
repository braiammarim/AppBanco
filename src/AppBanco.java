package com.unimetrocamp.banco.main;

import com.unimetrocamp.banco.model.Cliente;
import com.unimetrocamp.banco.model.Conta;
import com.unimetrocamp.banco.model.ContaCorrente;
import com.unimetrocamp.banco.model.ContaPoupanca;

import java.util.Scanner;

public class AppBanco {

    private static int menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Criar uma conta:");
        System.out.println("2. Consultar uma conta");
        System.out.println("3. Sacar");
        System.out.println("4. Depositar");
        System.out.println("9. Sair");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();

        return opcao;

    }


    public static void main(String[] args) {

        Conta objConta = new Conta();
        Cliente tmpObjCliente = new Cliente();

        Scanner leia = new Scanner(System.in);
        int opt;

        do {
            opt = menu();

            switch (opt) {

                case 1:     //1. Criar uma conta
                    System.out.print("Digite o nome do cliente da conta: ");
                    tmpObjCliente.setNome( leia.nextLine() );

                    System.out.print("Digite o cpf do cliente: ");
                    tmpObjCliente.setCpf( leia.nextLine() );

                    System.out.print("Digite o fone do cliente: ");
                    tmpObjCliente.setFone( leia.nextLine() );

                    objConta.setCliente( tmpObjCliente );
                    tmpObjCliente = null;

                    System.out.print("Digite o código da conta: ");
                    objConta.setCodigo( leia.nextLine() );

                    System.out.print("Digite o saldo inicial da conta: ");
                    objConta.setSaldo( leia.nextFloat() );
                    break;

                case 2:     //2. Consultar uma conta
                    System.out.println("Nome do cliente: " + objConta.getCliente().getNome());
                    System.out.println("CPF do cliente: " + objConta.getCliente().getCpf());
                    System.out.println("Fone do cliente: " + objConta.getCliente().getFone());
                    System.out.println("Código da conta: " + objConta.getCodigo());
                    System.out.println("Saldo da conta: " + objConta.getSaldo());
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    float valor_do_saque = leia.nextFloat();

                    objConta.sacar(valor_do_saque);
                    break;

                case 4:
                    System.out.print("Digite o valor a depositar: ");
                    float deposito = leia.nextFloat();

                    objConta.depositar(deposito);
                    break;

                case 5:
                    Cliente cli = new Cliente();
                    cli.setCpf("123.456.789-25");
                    cli.setNome("Bill Gates");
                    cli.setFone("19-9999-0000");

                    ContaCorrente cc = new ContaCorrente();
                    cc.setCodigo("CC1234");
                    cc.setCliente(cli);
                    cc.setSaldo(1000000f);
                    cc.setCpmf(1.0f);
                    cc.setTarifa(57f);

                    ContaPoupanca cp = new ContaPoupanca();
                    cp.setCodigo("P5678");
                    cp.setCliente(cli);
                    cp.setSaldo(10000000);
                    cp.setRendimento(2f);

                    cc.sacar(200000);
                    cp.sacar(3000000);

                    System.out.println("Saldo CC: " + cc.getSaldo());
                    System.out.println("Saldo Poupança: " + cp.getSaldo());


                case 9:
                    System.out.println("Saindo do sistema ...");
                    break;

                default:
                    System.out.println("Opção inválida");

            }

        } while (opt != 9);

    }

}