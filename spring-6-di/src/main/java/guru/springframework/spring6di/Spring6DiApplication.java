package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("\nSono dentro al Metodo MAIN");

		System.out.println("Metodo del Controller: " + controller.sayHello());
	}

}
