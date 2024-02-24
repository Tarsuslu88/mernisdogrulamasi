package com.dersler.kahvedunyasi.Adapters;

import com.dersler.kahvedunyasi.Abstract.ICustomerCheckService;
import com.dersler.kahvedunyasi.mernis.JAAKPSPublicSoap;
import com.dersler.kahvedunyasi.model.Customer;
import org.springframework.http.ResponseEntity;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {

        JAAKPSPublicSoap client = new JAAKPSPublicSoap();
        return client.TCKimlikNoDogrula( Long.valueOf(customer.getNationalityId() ), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getYearOfBirth() );

    }


}
