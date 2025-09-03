package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final EmailService emailService;

	// A dependência é injetada no construtor.
	public EmailNotifier(EmailService emailService) {
		this.emailService = emailService;
	}

	public void welcome(User user) {
		// Agora, o método 'welcome' só depende da abstração.
		// O bug do DRY_RUN é resolvido em um nível superior.
		this.emailService.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}