package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bindings.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	@GetMapping("/getCustomerData")
   public Customer getCustomer()
   {
	   Customer c=new Customer();
	   c.setCaddress("hyderabad");
	   c.setCid(101);
	   c.setCname("mahadev");
	   
	   return c;
   }
}
