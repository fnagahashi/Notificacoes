//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.addPreferenciaNotificacao(new Email());
        usuario1.addPreferenciaNotificacao(new SMS());
        usuario2.addPreferenciaNotificacao(new APP());
        usuario2.addPreferenciaNotificacao(new SMS());

        System.out.println("Notificações do usuário 1:");
        usuario1.EnviarNotificacao();

        System.out.println("Notificações do usuário 2:");
        usuario2.EnviarNotificacao();
    }
}