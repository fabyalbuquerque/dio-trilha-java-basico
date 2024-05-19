import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    String agencia = "";
    int conta = 0;
    String nomeCliente = "";
    double deposito = 0;
    double saldo = 0;

    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal contaTerminal = new ContaTerminal();

        contaTerminal.criarConta(scanner);
        contaTerminal.perguntarDeposito(scanner);
    }
    
    public void criarConta(Scanner scanner) {
        

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Agência com dígito (use - para separar dígito)");
        //Obter pela scanner os valores digitados
        agencia = scanner.next();
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da sua conta (apenas números)");
        //Obter pela scanner os valores digitados
        conta = scanner.nextInt();
        scanner.nextLine();
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Agora digite seu nome e sobrenome");
        //Obter pela scanner os valores digitados
        nomeCliente = scanner.nextLine();
    }

    public void perguntarDeposito(Scanner scanner) {
        System.out.println(nomeCliente + ", você quer fazer um depósito em sua nova conta?");
        String depositar = scanner.next();

        if (depositar.equalsIgnoreCase("sim")) {            
            System.out.println("Qual valor?");
            deposito = scanner.nextDouble();
            saldo += deposito;
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");

        } else {
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
        }

    }
}