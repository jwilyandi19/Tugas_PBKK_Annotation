package com.jwilyandi.pbkk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("XML Example");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanConfig.xml");
		
		Operation operationDiv =  (Operation)context.getBean("divOp", Operation.class);
		DivOperation op1 = (DivOperation)operationDiv;
		op1.setNum1(30);
		op1.setNum2(5);
		System.out.println(op1.getNum1() + "/" + op1.getNum2() + "=" + op1.operate() + " " + op1.getMessage());
		
		Operation operationMul =  (Operation)context.getBean("mulOp", Operation.class);
		MulOperation op2 = (MulOperation)operationMul;
		op2.setNum1(30);
		op2.setNum2(5);
		System.out.println(op2.getNum1() + "*" + op2.getNum2() + "=" + op2.operate() + " " + op2.getMessage());
		
		Operation operationAdd =  (Operation)context.getBean("addOp", Operation.class);
		AddOperation op3 = (AddOperation)operationAdd;
		op3.setNum1(30);
		op3.setNum2(5);
		System.out.println(op3.getNum1() + "+" + op3.getNum2() + "=" + op3.operate() + " " + op3.getMessage());
		
		Operation operationSub =  (Operation)context.getBean("subOp", Operation.class);
		SubOperation op4 = (SubOperation)operationSub;
		op4.setNum1(30);
		op4.setNum2(5);
		System.out.println(op4.getNum1() + "-" + op4.getNum2() + "=" + op4.operate() + " " + op4.getMessage());
		
		context.close();
	}
}
