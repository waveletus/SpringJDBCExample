package com.mkyong.common;

import com.mkyong.customer.dao.CustomerNameDAO;
import com.mkyong.customer.model.CustomerName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SimpleJdbcCustomerNameH2DBTemplateApp
{
    public static void main( String[] args )
    {
    	//if you have time, 
    	//it's better to create an unit test rather than testing like this :)
    	
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
    	
    	CustomerNameDAO customerNameSimpleDAO = (CustomerNameDAO) context.getBean("customerNameSimpleDAOH2");

        CustomerName customerA = customerNameSimpleDAO.findByCustomerId(1);
        System.out.println("Customer A : " + customerA);

        List<CustomerName> customerAs = customerNameSimpleDAO.findAll();
        for(CustomerName cust: customerAs){
        	 System.out.println("Customer As : " + customerAs);
        }
    }
}
