import java.util.Scanner;

public class ContaTerminal {
    // Atributos da conta
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Método principal para execução do programa
    public static void main(String[] args) {
        // Utiliza try-with-resources para garantir que o Scanner seja fechado corretamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Cria uma instância de ContaTerminal
            ContaTerminal conta = new ContaTerminal();

            // Solicita e recebe os dados do usuário
            System.out.println("Por favor, digite o número da Conta:");
            conta.numero = scanner.nextInt();

            // Consumir a linha pendente após a entrada do número
            scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência:");
            conta.agencia = scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            conta.nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo:");
            conta.saldo = scanner.nextDouble();

            // Exibe os dados da conta
            System.out.println(conta);
        } // O Scanner será fechado automaticamente aqui
    }

    // Sobrescreve o método toString para formatar a exibição dos dados da conta
    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
nomeCliente, agencia, numero, saldo);
    }
}
