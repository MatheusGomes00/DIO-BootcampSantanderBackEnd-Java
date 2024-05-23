package src.com.pilaresPOO;

import src.com.pilaresPOO.abstracao.CarroAbs;
import src.com.pilaresPOO.abstracao.MotoAbs;
import src.com.pilaresPOO.abstracao.VeiculoAbstrato;
import src.com.pilaresPOO.encapsulamento.CarroEncapsulado;
import src.com.pilaresPOO.exemplo1.Carro;
import src.com.pilaresPOO.heranca.Moto;
import src.com.pilaresPOO.heranca.Veiculo;

public class Autodromo {
    public static void main(String[] args) {
//        Carro vectra = new Carro();
//        vectra.acionarPartida();
//        vectra.confereCombustivel();
//        vectra.confereCambio();
//        vectra.ligar();

//    Exemplo encapsulamento:
//        CarroEncapsulado corsa = new CarroEncapsulado();
//        corsa.ligar();

//    Exemplo herança:
//        Veiculo falcon = new Moto();
//        falcon.setChassi("789543");
//        falcon.setModelo("2013");
//        falcon.setTipo("motortcicle");
//        System.out.println(falcon.toString());

//    Exemplo abstração
//        VeiculoAbstrato fusca = new CarroAbs();
//        fusca.ligar();
//        fusca.setChassi("78965453");
//        fusca.setModelo("87 1500");
//        fusca.setTipo("carro");
//        System.out.println(fusca.toString());

//    Exemplo de polimorfismo:
        MotoAbs lander = new MotoAbs();
        lander.ligar();
        VeiculoAbstrato coringa = lander;
        System.out.println(coringa.toString());
        coringa.setChassi("789456");
        coringa.setTipo("Moto");
        coringa.setModelo("250-2012");
        coringa.ligar();
    }
}
