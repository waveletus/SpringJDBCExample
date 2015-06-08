package com.mkyong.customer.dao.impl;

import com.mkyong.customer.dao.CustomerNameDAO;
import com.mkyong.customer.model.Customer;
import com.mkyong.customer.model.CustomerName;
import com.mkyong.customer.model.CustomerNameParameterizedRowMapper;
import com.mkyong.customer.model.CustomerParameterizedRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SimpleJdbcCustomerNameDAO extends SimpleJdbcDaoSupport implements CustomerNameDAO
{
	//query single row with ParameterizedRowMapper
	public CustomerName findByCustomerId(int custId){
		 
		String sql = "SELECT cust_id,name FROM CUSTOMER WHERE CUST_ID = ?";
 
		CustomerName customer = getSimpleJdbcTemplate().queryForObject(
				sql,  new CustomerNameParameterizedRowMapper(), custId);
	
		return customer;
	}
	

	//query mutiple rows with ParameterizedBeanPropertyRowMapper (Customer.class)
	public List<CustomerName> findAll() {

		String sql = "SELECT cust_id,name FROM CUSTOMER";

		List<CustomerName> customers =
				getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(CustomerName.class));

		return customers;
	}
}
