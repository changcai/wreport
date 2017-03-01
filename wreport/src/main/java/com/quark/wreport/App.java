package com.quark.wreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class App extends WebMvcConfigurerAdapter implements EmbeddedServletContainerCustomizer
{
	public static void main(String[] args)
	{
		SpringApplication.run(App.class, args);
	}

	
	@Override
	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		
	}

}
