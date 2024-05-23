public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo nova chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Iniciando reprodução");
    }

    @Override
    public void pausar() {
        System.out.println("Musica interrompida");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar musica: " + musica);
    }
}
