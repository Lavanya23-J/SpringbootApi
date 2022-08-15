package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.InvoiceData;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Repository.InvoiceRepository;

@RestController
@RequestMapping("/customer/data")
@CrossOrigin(origins="http://localhost:3000")
public class Customerslist {
	@Autowired
	private InvoiceRepository inrepo;
	
	//Get all the customers list

	@GetMapping
	public List<InvoiceData>getAllCustomers()
	{
		return this.inrepo.findAll();
		
	}
	
	//get the customer by using id
	
	@GetMapping("/{id}")
	public InvoiceData getInvoiceDataById(@PathVariable(value="id")long cusid)
	{
		return this.inrepo.findById(cusid).
	   orElseThrow(()->new ResourceNotFoundException("user Not Found with this id"+cusid));
		
	}
	
	//create the customer 
	
	@PostMapping
	
	public InvoiceData createInvoiceData(@RequestBody InvoiceData invoicedata)
	{
		return this.inrepo.save(invoicedata);
		
	}
	
	//update customer
	
		@PutMapping("/{id}")
		
		public InvoiceData updateInvoiceData(@RequestBody InvoiceData invoicedata,@PathVariable("id")long cusid )
		{
			InvoiceData existingcustomer=this.inrepo.findById(cusid).
			orElseThrow(()->new ResourceNotFoundException("user Not Found with this id"+cusid));
			
			existingcustomer.setBusinessname(invoicedata.getBusinessname());
			existingcustomer.setAddress(invoicedata.getAddress());
			existingcustomer.setContactperson(invoicedata.getContactperson());
			existingcustomer.setEmailaddress(invoicedata.getEmailaddress());
			existingcustomer.setTelnumber(invoicedata.getTelnumber());
			existingcustomer.setFax(invoicedata.getFax());
			existingcustomer.setMobnumforsms(invoicedata.getMobnumforsms());
			existingcustomer.setSpecifictax(invoicedata.getSpecifictax());
			existingcustomer.setDiscount(invoicedata.getDiscount());
			existingcustomer.setCategory(invoicedata.getCategory());
			existingcustomer.setType(invoicedata.getType());
			existingcustomer.setShiptoname(invoicedata.getShiptoname());
			existingcustomer.setShiptoaddress(invoicedata.getShiptoaddress());
			existingcustomer.setCity(invoicedata.getCity());
			existingcustomer.setCountry(invoicedata.getCountry());
			existingcustomer.setNotes(invoicedata.getNotes());
			
			return this.inrepo.save(existingcustomer);
		}
		
		//delete customer by id
		
		@DeleteMapping("/{id}")
		
		public ResponseEntity<InvoiceData>deleteInvoiceData(@PathVariable("id")long cusid)
		{
			InvoiceData existingInvoiceData=this.inrepo.findById(cusid).
			orElseThrow(()->new ResourceNotFoundException("user Not Found with this id"+cusid));
			this.inrepo.delete(existingInvoiceData);
			return ResponseEntity.ok().build();
		}
		
		

}

