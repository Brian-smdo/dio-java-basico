import java.text.DecimalFormat;
import java.util.Scanner;
@SuppressWarnings("resource")

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldoConta;

            System.out.println("Por favor, informe o número da conta:");
            numeroConta = scanner.nextInt();

            System.out.println("Por favor, informe a agência:");
            agencia = scanner.next();

            System.out.println("Por favor, informe seu nome:");
            nomeCliente = scanner.next();

            System.out.println("Por favor, informe quanto deseja depositar:");
            saldoConta = scanner.nextDouble();

            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            String saldoContaFormatada = decimalFormat.format(saldoConta);

            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldoContaFormatada + " já está disponível para saque.");

    }
}
