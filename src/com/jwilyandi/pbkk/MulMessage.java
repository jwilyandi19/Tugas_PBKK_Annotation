package com.jwilyandi.pbkk;

import org.springframework.stereotype.Component;

@Component
public class MulMessage implements Message {
	
	@Override
	public String returnMessage() {
		return "Perkalian";
	}

}
