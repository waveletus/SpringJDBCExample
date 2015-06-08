package com.mkyong.customer.model;

import java.io.Serializable;

public class CustomerName implements Serializable
{
    long custId;
    String name;
    int age;

    public CustomerName(){
    }

    public CustomerName(long custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public long getCustId() {
        return custId;
    }
    public void setCustId(long custId) {
        this.custId = custId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [custId=" + custId + ", name=" + name
                + "]";
    }


}
