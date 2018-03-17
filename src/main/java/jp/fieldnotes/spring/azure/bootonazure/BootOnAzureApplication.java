package jp.fieldnotes.spring.azure.bootonazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootOnAzureApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BootOnAzureApplication.class, args);
	}

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String getSomething() {
		return "Hello, Azure!";
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootOnAzureApplication.class);
	}

}
