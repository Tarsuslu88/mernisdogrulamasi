package com.dersler.kahvedunyasi.Concrete;

import com.dersler.kahvedunyasi.Abstract.BaseCustomerManager;
import com.dersler.kahvedunyasi.model.Customer;
import com.dersler.kahvedunyasi.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class NeroCustomerManager extends BaseCustomerManager {

    private CustomerRepository customerRepository;


    public NeroCustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void Save(Customer customer) {
        customerRepository.save(customer);
    }




}
