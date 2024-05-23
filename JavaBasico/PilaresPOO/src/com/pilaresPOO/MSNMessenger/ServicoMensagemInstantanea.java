package src.com.pilaresPOO.MSNMessenger;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
//    {primeiro confirmar se esta conectado a internet
//        validarConectadoInternet();
//        System.out.println("Enviando mensagem");
//        //depois de enviada, salva o histórico da mensagem
//        salvarHistoricoMensagem();
//    }
    public abstract void receberMensagem();
//    {
//        System.out.println("Recebendo mensagem");
//    }
//
//    //métodos privadas, visíveis somente na classe
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
