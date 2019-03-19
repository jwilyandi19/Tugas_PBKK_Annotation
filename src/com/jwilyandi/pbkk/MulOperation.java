package com.jwilyandi.pbkk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MulOperation implements Operation {
	@Autowired
	@Qualifier("mulMessage")
	private Message mulMessage;
	private int num1;
	private int num2;
	public MulOperation(int num1,int num2,Message message) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.mulMessage = message;
	}
	public MulOperation(Message message) {
		super();
		this.mulMessage = message;
	}
	
	public MulOperation() {
		super();
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return num2;
	}

	public int operate() {
		return this.num1 * this.num2;
	}
	public void setMessage(Message message) {
		this.mulMessage = message;
	}
	
	public Message getMessage() {
		return mulMessage;
	}
	
	public String returnMessage() {
		return Integer.toString(num1) + "*" + Integer.toString(num2) + "="
				+ Integer.toString(operate());
	}
}
