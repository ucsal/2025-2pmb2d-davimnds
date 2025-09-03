package br.com.mariojp.solid.dip;

public interface EmailService {
    void send(String to, String subject, String body);
}