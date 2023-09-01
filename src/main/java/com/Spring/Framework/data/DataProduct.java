package com.Spring.Framework.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DataProduct implements Product {

	private String driverClassName;
	private String url;
	private String user;
	private String password;
	
	private Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, user, password);		
	}
	
    @Override
    public long count() {
    	try(
    		Connection connection = createConnection();
    		PreparedStatement statement = connection.prepareStatement("select count(*) from categories");
    		ResultSet result = statement.executeQuery();
    	) {
    		result.next();
    		return result.getLong(1);	
    	} 
    	catch(Exception exp) {
    		throw new RuntimeException(exp);
    	}
    }
}
