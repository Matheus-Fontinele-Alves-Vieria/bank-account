import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String formattedAgency = "";

        System.out.println("\nConta Bancária: DIO\n");

        System.out.print("Digite o número da conta: ");
        int number = scanner.nextInt();

        System.out.print("Digite o número da agência: ");
        String agency = scanner.next();

        scanner.nextLine();

        System.out.print("Digite o seu nome: ");
        String clientName = scanner.nextLine();

        System.out.print("Informe o seu saldo: R$ ");
        float balance = scanner.nextFloat();

        scanner.close();

        agency = agency.replace("-", "");

        if(agency.length() > 4) {
            throw new IllegalArgumentException("Número da agência inválido!");
        } else if(agency.length() < 4) {
            throw new IllegalArgumentException("Número da agência incompleto!");
        } else {
            formattedAgency = agency.substring(0, 3) + "-" + agency.charAt(3);
        }

        System.out.println("\nDados da conta\n");

        System.out.println("Olá " + clientName.toUpperCase() + ", obrigado por criar uma conta em nosso banco, " +
        "sua agência é " + formattedAgency + ", conta " + number + " e seu saldo de R$ " + balance + " já está " +
        "disponível para saque.\n");
    }
}
