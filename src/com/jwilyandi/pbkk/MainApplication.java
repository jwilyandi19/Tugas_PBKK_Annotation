package com.jwilyandi.pbkk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Annotation Example");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanConfig.xml");
		
		//Annotation
		Operation operationDiv =  context.getBean("divOperation", Operation.class);
		DivOperation op1 = (DivOperation)operationDiv;
		op1.setNum1(12);
		op1.setNum2(2);
		op1.setMessage("Pembagian");
		System.out.println(op1.returnMessage());
		
		//Annotation + AutoWired
		Operation operationMul =  context.getBean("mulOperation", Operation.class);
		MulOperation op2 = (MulOperation)operationMul;
		op2.setNum1(12);
		op2.setNum2(5);
		System.out.println(op2.returnMessage() + ' ' +
				op2.getMessage().returnMessage());
		
		//Annotation + AutoWired
		Operation operationAdd =  context.getBean("addOperation", Operation.class);
		AddOperation op3 = (AddOperation)operationAdd;
		op3.setNum1(12);
		op3.setNum2(2);
		System.out.println(op3.returnMessage() + ' ' +
				op3.getMessage().returnMessage());
		
		//Annotation
		Operation operationSub =  context.getBean("subOperation", Operation.class);
		SubOperation op4 = (SubOperation)operationSub;
		op4.setNum1(12);
		op4.setNum2(2);
		op4.setMessage("Pengurangan");
		System.out.println(op4.returnMessage());
		context.close();
	}
}
