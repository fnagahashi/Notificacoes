
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Notificacao> preferenciasNotificacao;

    public Usuario(){
        preferenciasNotificacao = new ArrayList<Notificacao>();
    }

    public void addPreferenciaNotificacao(Notificacao notificacao){
        preferenciasNotificacao.add(notificacao);
    }
    public void EnviarNotificacao(){
        for(Notificacao notificacao : preferenciasNotificacao){
            notificacao.EnviarNotificacao();
        }
    }

}
