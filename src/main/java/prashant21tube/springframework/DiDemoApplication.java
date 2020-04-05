package prashant21tube.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import prashant21tube.springframework.config.PropertyConfig;
import prashant21tube.springframework.controller.ConstructorInjectedController;
import prashant21tube.springframework.controller.MyController;
import prashant21tube.springframework.controller.PropertyInjectedController;
import prashant21tube.springframework.controller.SetterInjectedController;
import prashant21tube.springframework.propertybeans.FakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController) context.getBean("myController");
		//controller.sayHello();
		
		/*System.out.println(controller.sayHello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());*/
		
		/**
		 * Load the property file data into Spring Bean
		 */
		FakeDataSource dataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		System.out.println(dataSource.getUsername());
		System.out.println(dataSource.getPassword());
		System.out.println(dataSource.getUrl());
	}

}
