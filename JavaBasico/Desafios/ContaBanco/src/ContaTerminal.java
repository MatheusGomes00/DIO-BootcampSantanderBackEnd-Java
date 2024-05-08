import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome");
        String nome = scanner.next();
        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o Agencia");
        String agencia = scanner.next();
        System.out.println("Digite o Saldo");
        float saldo = scanner.nextFloat();
        scanner.close();
        
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + 
        ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");        
    }
}
