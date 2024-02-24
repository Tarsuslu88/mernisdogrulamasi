package com.dersler.kahvedunyasi.Abstract;

import com.dersler.kahvedunyasi.model.Customer;

public interface ICustomerCheckService {

    boolean CheckIfRealPerson(Customer customer) throws Exception;

}
