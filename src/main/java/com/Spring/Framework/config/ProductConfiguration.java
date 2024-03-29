package com.Spring.Framework.config;

import com.Spring.Framework.data.DataProduct;
import com.Spring.Framework.data.DummyProduct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:database.properties")
public class ProductConfiguration {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;

	@Lazy
    @Bean
    public DummyProduct dummy() {
    	System.out.println("Calling dummy");
        return new DummyProduct();
    }
	@Lazy
    @Bean
    public DataProduct data() {
		
        DataProduct data = new DataProduct();
        
        data.setDriverClassName(driver);
        data.setUrl(url);
        data.setUser(user);
        data.setPassword(password);
        return data;
    }
}
