import java.util.Scanner;

public class SimulacaoBancaria {
    public static void menu(){
      System.out.println("""
      1. Depositar
      2. Sacar
      3. Consultar Saldo
      4. Encerrar""");
    }
    
    public static Double Depositar(double saldo){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite o valor do deposito: ");
      double valor = scanner.nextDouble();
      double novoSaldo = saldo + valor;
      System.out.println("Saldo atual: " + novoSaldo);
      return novoSaldo;
    }

    public static Double Sacar(double saldo, double valor){
        double novoSaldo = saldo - valor;
        System.out.println("Saldo atual: " + novoSaldo);
        return novoSaldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
          // System.out.println("\n" + saldo + "\n");
          menu();
          int opcao = scanner.nextInt();
          if (opcao != 4){
            switch (opcao) {
              case 1:
                saldo = Depositar(saldo);
                break;
              case 2:
                System.out.println("Digite o valor do saque: ");
                double valor = scanner.nextDouble();
                if (saldo >= valor){
                  saldo = Sacar(saldo, valor);
                  break;
                }else{
                  System.out.println("Saldo insuficiente.");
                  break;
                }
              case 3:
                System.out.println("Saldo atual: " + saldo);
                break;
              default:
                System.out.println("Opcao invalida. Tente novamente.");
                break;
            }
          }else{
            System.out.println("Programa encerrado.");
            scanner.close();
            break;
          }              
        }
    }
}
