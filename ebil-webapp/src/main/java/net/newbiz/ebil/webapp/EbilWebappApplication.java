package net.newbiz.ebil.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
//@ImportResource("classpath:testApplicationContext.xml")
public class EbilWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbilWebappApplication.class, args);
	}
}
