package src.com.pilaresPOO.MSNMessenger;

public class ComputadorMatheusinho {
    public static void main(String[] args) {
//        MSNMessenger msn = new MSNMessenger();
//        msn.receberMensagem();
//        msn.enviarMensagem();
////        msn.validarConectadoInternet();
////        msn.salvarHistoricoMensagem();
//        FacebookMessenger fbm = new FacebookMessenger();;
//        fbm.enviarMensagem();
//        fbm.receberMensagem();
        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="fbm";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();
        
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
