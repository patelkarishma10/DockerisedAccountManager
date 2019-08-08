package com.bae.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entity.SentUser;
import com.bae.repository.SentUserRepository;

@Component
public class SentUserRceiver {

	private SentUserRepository repository;

	@Autowired
	public SentUserRceiver(SentUserRepository repository) {

		this.repository = repository;
	}

	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(SentUser sentUser) {

		System.out.println(sentUser);
		repository.save(sentUser);
	}

}
