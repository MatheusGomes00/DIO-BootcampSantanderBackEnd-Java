public class Main {
    public static void main(String[] args) {
        iPhone iPhone7 = new iPhone();

        iPhone7.adicionarNovaAba();
        iPhone7.atualizarPagina();
        iPhone7.exibirPagina("https://teste123.com.br");

        iPhone7.ligar("(35) 99979-4638");
        iPhone7.atender();
        iPhone7.iniciarCorreioVoz();

        iPhone7.tocar();
        iPhone7.pausar();
        iPhone7.selecionarMusica("Black - Pearl Jam");
    }
}