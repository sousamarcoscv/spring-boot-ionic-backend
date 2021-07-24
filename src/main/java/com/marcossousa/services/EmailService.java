package com.marcossousa.services;

import org.springframework.mail.SimpleMailMessage;

import com.marcossousa.domain.Pedido;

public interface EmailService {
	
	public void sendOrderConfirmationEmail(Pedido obj);
	
	public void sendEmail(SimpleMailMessage msg);
	
}
