package com.dersler.kahvedunyasi.Concrete;

import com.dersler.kahvedunyasi.Abstract.BaseCustomerManager;
import com.dersler.kahvedunyasi.Abstract.ICustomerCheckService;
import com.dersler.kahvedunyasi.Abstract.ICustomerService;
import com.dersler.kahvedunyasi.model.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {

        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        try {
            if(customerCheckService.CheckIfRealPerson(customer)){
                super.Save(customer);
            }else{
                System.out.println("Not a valid person");
                //new Exception("Not a valid person");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
