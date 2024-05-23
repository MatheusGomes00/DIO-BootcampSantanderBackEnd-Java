package src.com.pilaresPOO.encapsulamento;

public class CarroEncapsulado {
    public void ligar(){
        acionarPartida();
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    } // removemos da visibilidade do usuário o que ele não precisa ter acesso
    public void acionarPartida(){
        System.out.println("acionando conferencia");
    }
    public void confereCombustivel(){
        System.out.println("conferindo combustível");
    }
    public void confereCambio(){
        System.out.println("conferindo cambio em N");
    }
}
