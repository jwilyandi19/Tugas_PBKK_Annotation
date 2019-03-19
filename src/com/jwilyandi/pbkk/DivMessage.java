package com.jwilyandi.pbkk;

import org.springframework.stereotype.Component;

@Component
public class DivMessage implements Message {

	@Override
	public String returnMessage() {
		return "Pembagian";
	}

}
