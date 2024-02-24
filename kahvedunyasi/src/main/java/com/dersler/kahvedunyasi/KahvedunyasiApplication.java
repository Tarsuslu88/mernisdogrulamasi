package com.dersler.kahvedunyasi;

import com.dersler.kahvedunyasi.Abstract.BaseCustomerManager;
import com.dersler.kahvedunyasi.Adapters.MernisServiceAdapter;
import com.dersler.kahvedunyasi.Concrete.StarbucksCustomerManager;
import com.dersler.kahvedunyasi.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KahvedunyasiApplication {

    public static void main(String[] args) {

        SpringApplication.run(KahvedunyasiApplication.class, args);

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.setFirstName("H******");
        customer.setLastName("*******K");
        customer.setYearOfBirth(1988);
        customer.setNationalityId("***********");

        try {
            customerManager.Save(customer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



}
