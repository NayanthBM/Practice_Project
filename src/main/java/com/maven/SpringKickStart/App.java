package com.maven.SpringKickStart;

import com.Spring.Framework.config.ProductConfiguration;
import com.Spring.Framework.data.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        Product product;

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);

        product = context.getBean("data",Product.class);

        System.out.println("There are "+product.count()+" Products");
        
        System.out.println("Successfully");

        context.close();
    }

}
