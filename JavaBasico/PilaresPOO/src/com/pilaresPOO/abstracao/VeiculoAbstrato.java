package src.com.pilaresPOO.abstracao;

public abstract class VeiculoAbstrato {
    private String chassi;
    private String tipo;
    private String modelo;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();

    public void acionarPartida(){
        System.out.println("acionando conferencia");
    }
    public void confereCombustivel(){
        System.out.println("conferindo combustível");
    }
    public void confereCambio(){
        System.out.println("conferindo cambio em N");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "chassi='" + chassi + '\'' +
                ", tipo='" + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
