package com.infinx.bills;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {
	
	@Autowired
	BillRepo billRepo;
	
	@GetMapping("/bills")
	public List<Bill> getBills(){	
		return billRepo.findAll();
	}
	@PostMapping("/addBill")
	public ResponseEntity addBill(@RequestBody Bill bill)
	{
		billRepo.save(bill);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
