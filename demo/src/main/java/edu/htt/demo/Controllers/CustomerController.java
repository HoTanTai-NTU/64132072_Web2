package edu.htt.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import edu.htt.demo.repositories.CustomerRepository;
import edu.htt.demo.models.Customer;

//@Controller

@Controller
public class CustomerController {
	@Autowired
	CustomerRepository myCustomerRepository;
	
	@GetMapping("/customer/all")
	public String getAll (Model m)
	{
		ArrayList<Customer> dskh = new ArrayList<Customer>(); 
		dskh = myCustomerRepository.findAll();
		return null;
	}
}
