package com.nyash.rooms.roomsguestservices.repository;

import com.nyash.rooms.roomsguestservices.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
    Guest findByEmailAddress(String emailAddress);

    Guest findOne(long id);
}
