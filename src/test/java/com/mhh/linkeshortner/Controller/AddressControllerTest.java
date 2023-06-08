package com.mhh.linkeshortner.Controller;

import com.mhh.linkeshortner.Entity.Address;
import com.mhh.linkeshortner.Service.AddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressControllerTest {
    @Autowired
    private AddressService addressService;

    @Test
    void insert() {
        Address address = new Address();
        address.setUrl("test");
        addressService.insert(address);
    }

    @Test
    void findbyUrl() {
    }
}