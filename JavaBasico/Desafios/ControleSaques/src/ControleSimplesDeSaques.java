import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        for(int i=0; limiteDiario > 0; i++){
// TODO: Solicite ao usuário o valor do saque:
            double saque = scanner.nextDouble();   
// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if(saque <= 0){
              System.out.println("Transacoes encerradas.");
              limiteDiario = 0;
            } else if(saque > limiteDiario){
              System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
              limiteDiario = 0;
            } else{
              limiteDiario -= saque;
              System.out.println("Saque realizado. Limite restante: " + limiteDiario);
              
            }
        }
        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
