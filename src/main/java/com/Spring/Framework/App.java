package com.Spring.Framework;

import com.Spring.Framework.config.ProductConfiguration;
import com.Spring.Framework.config.ProductConfigurationB;
import com.Spring.Framework.data.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        Product product;

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfigurationB.class);

        product = context.getBean("dataProduct",Product.class);

        System.out.println("There are "+product.count()+" Products");

        context.close();
    }
}
