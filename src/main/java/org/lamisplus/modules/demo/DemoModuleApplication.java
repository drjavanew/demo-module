package org.lamisplus.modules.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableSwagger2
@SpringBootApplication
public class DemoModuleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoModuleApplication.class, args);

		System.out.println("helloWorldController  "+context.containsBeanDefinition("helloWorldController"));

		System.out.println("DemoModuleApplication  "+context.containsBeanDefinition("demoModuleApplication"));

	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}

}
