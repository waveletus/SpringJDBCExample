package com.mkyong.customer.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerNameRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustId(rs.getInt("CUST_ID"));
		customer.setName(rs.getString("NAME"));
		return customer;
	}
	
}
