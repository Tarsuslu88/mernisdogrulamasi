package com.dersler.kahvedunyasi.Concrete;

import com.dersler.kahvedunyasi.Abstract.ICustomerCheckService;
import com.dersler.kahvedunyasi.model.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        return false;
    }

}
