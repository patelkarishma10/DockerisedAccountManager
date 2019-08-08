package com.bae.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {

	}

	@Override
	public ResponseEntity<String> getPrize(String accNum) {
//		Random random = new Random();
//		Integer num = random.nextInt(899999) + 100000;
//		String numString = num.toString();
//		String accountNumber = restTemplate.getForObject("http://localhost:8080/user/sendAccountNumber", String.class);
//		System.out.println(accountNumber);
		char letter = accNum.charAt(0);
		if (letter == 'a') {
			ResponseEntity<String> retVal = new ResponseEntity<String>("sorry no prize", HttpStatus.OK);
			return retVal;
		} else if (letter == 'b') {
			ResponseEntity<String> retVal = new ResponseEntity<String>("you have won £50", HttpStatus.OK);
			return retVal;
		} else {
			ResponseEntity<String> retVal = new ResponseEntity<String>("you have won £500", HttpStatus.OK);
			return retVal;
		}

	}

}
