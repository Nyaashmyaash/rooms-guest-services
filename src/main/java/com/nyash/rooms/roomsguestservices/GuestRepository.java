package com.nyash.rooms.roomsguestservices;

import com.nyash.rooms.roomsguestservices.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
    Guest findByEmailAddress(String emailAddress);

    Guest findById(long id);
}
