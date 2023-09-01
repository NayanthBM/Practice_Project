package com.Spring.Framework.config;

import com.Spring.Framework.data.DataProduct;
import com.Spring.Framework.data.DummyProduct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ProductConfiguration {
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
        
        data.setDriverClassName("org.h2.Driver");
        data.setUrl(" jdbc:h2:mem:testdb");
        data.setUser("nayan");
        data.setPassword("password");
        return data;
    }
}
