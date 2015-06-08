package com.mkyong.customer.dao;

import com.mkyong.customer.model.CustomerName;

import java.util.List;

public interface CustomerNameDAO
{
	public CustomerName findByCustomerId(int custId);

	public List<CustomerName> findAll();
	
}