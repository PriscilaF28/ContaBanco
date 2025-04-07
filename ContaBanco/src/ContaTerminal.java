import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");

        System.out.println("Digite o número da conta");
        int numero_conta = scanner.nextInt();

        System.out.println("Digite o codigo da agência");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nome_cliente = scanner.next();

        System.out.println("Digite o saldo da conta do cliente");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá [%s], obrigado por criar uma conta em nosso banco, " +
                "sua agência é [%s], conta [%s] e seu saldo [%s] já está disponível para saque.",
            nome_cliente, agencia, numero_conta, saldo));
    }
}
