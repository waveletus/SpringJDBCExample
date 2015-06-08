package com.mkyong.customer.model;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerNameParameterizedRowMapper implements ParameterizedRowMapper<CustomerName>
{
	public CustomerName mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomerName customer = new CustomerName();
		customer.setCustId(rs.getInt("CUST_ID"));
		customer.setName(rs.getString("NAME"));
		return customer;
	}
	
}
