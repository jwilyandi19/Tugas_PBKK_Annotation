package com.jwilyandi.pbkk;

public class SubOperation implements Operation {
	private int num1;
	private int num2;
	private String message;
	public SubOperation() {
	
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
		return this.num1 - this.num2;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
