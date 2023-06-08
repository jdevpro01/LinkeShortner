package com.mhh.linkeshortner.Repository;

import com.mhh.linkeshortner.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AddressRepo extends JpaRepository<Address, Long> {
    Address findByUrl(String url);
}
