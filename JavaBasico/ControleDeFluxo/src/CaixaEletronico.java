import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("""
                            Bem-vindo ao Caixa Eletronico!
                            Selecione uma opcao
                            1. Ver saldo
                            2. Sacar dinheiro
                            3. Depositar dinheiro
                            4. Sair""");
        
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Saldo: R$ 500.000,00");
                break;
            case 2:
                System.out.println("Digite o valor a sacar:");
                double valorSaque = scanner.nextDouble();
                if(valorSaque > 0){
                    System.out.println("Voce sacou: R$ " + valorSaque);
                } else{
                    System.out.println("Valor invalido.");
                }
                break;
            case 3:
                System.out.println("Digite o valor a depositar:");
                double valorDeposito = scanner.nextDouble();
                if(valorDeposito > 0 ){
                    System.out.println("Voce depositou: R$ " + valorDeposito);
                } else{
                    System.out.println("Valor invalido.");
                }
                break;
            case 4:
                System.out.println("Saindo do Caixa Eletronico...");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        scanner.close();
    }
}
