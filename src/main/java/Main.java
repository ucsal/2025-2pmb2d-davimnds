import br.com.mariojp.solid.dip.*;

public class Main {
	public static void main(String[] args) {
		System.setProperty("DRY_RUN", "true");

		// A lógica de escolha do serviço acontece aqui.
		EmailService service;
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			service = new DryRunEmailService();
		} else {
			service = new SmtpClient();
		}

		// Injetamos a implementação correta no Notifier.
		var notifier = new EmailNotifier(service);

		notifier.welcome(new User("Ana", "ana@example.com"));
		System.out.println("E-mail enviado!");
	}
}