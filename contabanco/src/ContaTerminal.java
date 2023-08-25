import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    int numero;
    String agencia;
    String NomeCliente;
    float saldo  = 875.40f;

    System.out.println("Digite o número da sua conta:");
    numero = scanner.nextInt();

    System.out.println("Digite o número da sua agência");
    agencia = scanner.next();

    System.out.println("Digite seu nome:");
    NomeCliente = scanner.next();

    System.out.println("Olá " + NomeCliente + ", obrigado por ter uma conta conosco. Sua agência é " + agencia + ", conta de número " + numero + ". Seu saldo de " + saldo + " já está disponível para resgaste.");
    

    }
}
