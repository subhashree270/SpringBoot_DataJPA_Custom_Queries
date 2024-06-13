package in.subha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.subha.service.CustomerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		CustomerService service = ctxt.getBean(CustomerService.class);
		
		//service.saveCustomers();
		//service.updateCustomer();
		service.getProjection();
	}

}
