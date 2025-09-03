package br.com.mariojp.solid.dip;

public class DryRunEmailService implements EmailService {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("Modo DRY_RUN: Simulando o envio de e-mail para: " + to);
    }
}