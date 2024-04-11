import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        enum TipoDeConta {
            CORRENTE, SALARIO, POUPANCA
        }
        enum OpcoesDoMenu {
            INICIO, CONSULTA, RECEBIMENTO, TRANSFERENCIA, SAIR, INVALIDA
        }
        double saldo = 4000;
        String nomeCliente = "Fernando Medeiros do Nascimento";
        TipoDeConta tipoDeConta = TipoDeConta.CORRENTE;

        System.out.printf("""
                ***********************
                Dados iniciais do cliente:
                        
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                %n""", nomeCliente, tipoDeConta, saldo);

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        OpcoesDoMenu[] listaOpcoes = OpcoesDoMenu.values();

        while (listaOpcoes[opcao] != OpcoesDoMenu.SAIR) {
            System.out.println("""
                    Operações
                                        
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                        
                    Digite a opção desejada:
                    """);
            opcao = leitura.nextInt();
            OpcoesDoMenu opcSelecionada = opcao < listaOpcoes.length ? listaOpcoes[opcao] : OpcoesDoMenu.INVALIDA;
            switch (opcSelecionada) {
                case CONSULTA:
                    consultarSaldo(saldo);
                    break;
                case RECEBIMENTO:
                    saldo = receberValor(saldo, leitura);
                    break;
                case TRANSFERENCIA:
                    saldo = transfereValor(saldo, leitura);
                    break;
                case SAIR:
                    break;
                default:
                    System.out.println("Opção inválida");
                    opcao = 0;
                    break;

            }
        }
    }

    private static double transfereValor(double saldo, Scanner leitura) {
        System.out.println("Informe o valor que deseja transferir:");
        double valorATransferir = leitura.nextDouble();
        if (valorATransferir > saldo) {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
            return saldo;
        }
        double novoSaldo = saldo - valorATransferir;
        System.out.println("Saldo atualizado R$ %.2f".formatted(novoSaldo));
        return novoSaldo;
    }

    private static double receberValor(double saldo, Scanner leitura) {
        System.out.println("Informe o valor a receber:");
        double novoValor = leitura.nextDouble();
        double novoSaldo = saldo + novoValor;
        System.out.println("Saldo atualizado R$ %.2f".formatted(novoSaldo));
        return novoSaldo;
    }

    private static void consultarSaldo(double saldo) {
        System.out.printf("O saldo atual é R$ %.2f%n", saldo);
    }
}
