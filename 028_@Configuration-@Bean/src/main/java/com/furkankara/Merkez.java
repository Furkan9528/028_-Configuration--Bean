package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		
		 //ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

		 AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		 appCtx.register(SpringBeanConfig.class);
		 
		 appCtx.refresh();
		 
		 Ogrenci ogrenci = appCtx.getBean(Ogrenci.class);
		 System.out.println(ogrenci.getSehir().getSehirAdi());
		 System.out.println(ogrenci.getSehir().getPlakaNo());
		 
		 
		// ((ConfigurableApplicationContext)appCtx).close();
		 appCtx.close();
	
	
	
	}
}
