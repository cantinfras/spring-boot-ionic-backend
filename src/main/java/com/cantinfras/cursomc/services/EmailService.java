package com.cantinfras.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.cantinfras.cursomc.domain.Cliente;
import com.cantinfras.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
