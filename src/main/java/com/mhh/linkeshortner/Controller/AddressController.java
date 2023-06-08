package com.mhh.linkeshortner.Controller;

import com.mhh.linkeshortner.Entity.Address;
import com.mhh.linkeshortner.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AddressController {
    @Autowired
    private AddressService addressService;

    public void insert(Address address) {
        addressService.insert(address);
    }

    public void findbyUrl(String url) {
        addressService.findbyUrl(url);
    }

}
