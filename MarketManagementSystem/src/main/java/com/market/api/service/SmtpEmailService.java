package com.market.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.market.api.core.EmailProperties;

import jakarta.mail.internet.MimeMessage;

@Service
public class SmtpEmailService implements SendEmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private EmailProperties emailProp;
	
	public void sendEmail(Message message) {
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
			helper.setFrom(emailProp.getSender());
			helper.setTo(message.getRecievers().toArray(new String[0]));
			helper.setSubject(message.getTittle());
			helper.setText(message.getBody(), true);
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	
		
		
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		
	}

}
