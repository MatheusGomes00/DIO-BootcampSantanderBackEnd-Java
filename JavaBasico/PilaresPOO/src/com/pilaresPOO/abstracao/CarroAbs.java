package src.com.pilaresPOO.abstracao;

public class CarroAbs extends VeiculoAbstrato{

    public CarroAbs(){}

    @Override
    public void ligar() {
        System.out.println("CARRO LIGADO");
    }
}
