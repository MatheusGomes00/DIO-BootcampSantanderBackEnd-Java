public class ExemploExecao2 {    
    public static void main(String[] args) {
        try{
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " +  e.getMessage() + "\nÍndice fora dos limites do array.");
        }

        try{
            int resultado = 10 / 0;
            System.out.println(resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro: Divisão por zero.");
        }

        try{
            String texto = null;
            System.out.println(texto.length());
        }catch(Exception e){
            System.out.println("Erro: Tentativa de acesso a um objeto nulo.");
        }

        // exceção personalizada
        try {
            int valor = -5;
            if(valor < 0){
                throw new ValorNegativoException("Erro: Valor negativo não é permitido");
            }
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }
    }


}
