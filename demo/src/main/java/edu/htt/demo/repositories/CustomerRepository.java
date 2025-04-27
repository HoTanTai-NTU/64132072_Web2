package edu.htt.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.htt.demo.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {	

}
