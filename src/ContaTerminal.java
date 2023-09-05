import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("digite o numero da Agencia:");
        String agencia = sc.nextLine();

        System.out.println("Digite o numero: ");
        int numero = sc.nextInt();

        System.out.println("Seu saldo ");
        double saldo = sc.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    }
}