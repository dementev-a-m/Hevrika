package ru.dementev.hevrika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.dementev.hevrika.entity.Customer;

import java.util.List;

/**
 * Created by adementev on 13.09.2017.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "select c from Customer c where c.firstName = :firstName")
    List<Customer> findByName(@Param("firstName") String firstName);
}
