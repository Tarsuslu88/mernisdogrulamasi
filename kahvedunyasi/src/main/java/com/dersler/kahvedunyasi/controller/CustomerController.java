package com.dersler.kahvedunyasi.controller;

import com.dersler.kahvedunyasi.Concrete.NeroCustomerManager;
import com.dersler.kahvedunyasi.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final NeroCustomerManager neroCustomerManager;

    public CustomerController(NeroCustomerManager neroCustomerManager) {
        this.neroCustomerManager = neroCustomerManager;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addToCustomer(@RequestBody Customer customer){
        if((customer.toString()).length()>0){
            neroCustomerManager.Save(customer);
            return ResponseEntity.ok("Hesabınız başarılı bir şekilde oluşturuldu");
        }else{
            return ResponseEntity.badRequest().body("Girilen bilgiler eksik veya hatalıdır.");
        }

    }


}
