package src.com.pilaresPOO.abstracao;

public class MotoAbs extends VeiculoAbstrato {

    public MotoAbs(){
    }

    @Override
    public void ligar(){
        acionarPartida();
        confereCambio();
        confereCombustivel();
        System.out.println("Ligando moto");
    }
}
