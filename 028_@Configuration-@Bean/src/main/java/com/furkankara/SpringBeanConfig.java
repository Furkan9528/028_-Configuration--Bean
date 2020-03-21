package com.furkankara;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean
	public Sehir sehir()
	{
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Manisa");
		sehir.setPlakaNo(45);
		return sehir;
		
	}
	
/*
   		<bean id="sehir" class="com.furkankara.Sehir">
			<property name="sehirAdi" value="Manisa"></property>
			<property name="plakaNo" value="45"></property>
		</bean>
 */
	
	@Bean
	public Ogrenci ogrenci() {	
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setSehir(sehir());
		return ogrenci;
	}
	
	
	

/*	<bean id="ogrenci" class="com.furkankara.Ogrenci">
	<property name="sehir" >
		<ref bean="sehir"/>
	</property>
	</bean>*/
	
	

	
}
