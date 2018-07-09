package tn.enig.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.enig.service.Service1;

public class Test1 {
	
	public static void main(String[] args) {
		
		//ApplicationContext cxt= new ClassPathXmlApplicationContext("contexte.xml");
		//Service1 s1= (Service1) cxt.getBean("serv1");
		ApplicationContext cxt= new AnnotationConfigApplicationContext("tn.enig");
		Service1 s1=(Service1)cxt.getBean(Service1.class);
		System.out.println(s1.getMessage());
		
	}

}
