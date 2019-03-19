package com.jwilyandi.pbkk;

import org.springframework.stereotype.Component;

@Component
public class AddMessage implements Message {

	@Override
	public String returnMessage() {
		return "Pertambahan";
	}
	
}
