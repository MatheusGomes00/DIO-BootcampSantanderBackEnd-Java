public class LacosDeRepeticao {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};
        
        System.out.println("Exemplo de laço 'for': ");
        for(int i=0; i<numeros.length; i++){
            System.out.println("Numero: " + numeros[i]);
        }

        System.out.println("\nExemplo de laço 'for each': ");
        for(int numero : numeros){
            System.out.println("Numero: " + numero);
        }

        System.out.println("\nExemplo de laço 'while': ");
        int contador = 0;
        while (contador < numeros.length){
            System.out.println("Numero: " + numeros[contador]);
            contador++;
        }

        System.out.println("\nExemplo de laço 'do while': ");
        contador = 0;
        do{
            System.out.println("Numero: " + numeros[contador]);
            contador++;
        }while (contador < numeros.length);
    }
    
}
