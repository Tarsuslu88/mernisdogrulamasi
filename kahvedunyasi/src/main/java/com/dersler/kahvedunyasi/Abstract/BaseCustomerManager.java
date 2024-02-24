package com.dersler.kahvedunyasi.Abstract;

import com.dersler.kahvedunyasi.model.Customer;
import com.dersler.kahvedunyasi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseCustomerManager  implements ICustomerService{



    @Override
    public void Save(Customer customer) throws Exception {
        //System.out.println("Saved to db " + customer.getFirstName() + " " + customer.getLastName());

    }
}
