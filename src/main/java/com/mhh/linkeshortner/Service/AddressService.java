package com.mhh.linkeshortner.Service;

import com.mhh.linkeshortner.Entity.Address;
import com.mhh.linkeshortner.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;
@Transactional
    public Address findbyUrl(String url) {
        return addressRepo.findByUrl(url);
    }

    public Address insert(Address address) {
        return addressRepo.save(address);
    }

}
