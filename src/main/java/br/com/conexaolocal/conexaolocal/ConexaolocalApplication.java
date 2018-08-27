package br.com.conexaolocal.conexaolocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@ServletComponentScan
@SpringBootApplication
@ComponentScan("br.com.conexaolocal")
public class ConexaolocalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConexaolocalApplication.class, args);
	}
}
