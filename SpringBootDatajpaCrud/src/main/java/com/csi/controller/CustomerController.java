package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Customer> savedata(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerServiceImpl.saveData(customer));
    }

    @GetMapping("/getdata")
    public ResponseEntity<List<Customer>> getAlldata() {
        return ResponseEntity.ok(customerServiceImpl.getAllData());
    }

    @PutMapping("/updatedata/{custId}")
    public ResponseEntity<Customer> updatedata(@PathVariable int custId, @RequestBody Customer customer) {
        return ResponseEntity.ok(customerServiceImpl.updateData(customer));
    }

    @DeleteMapping("/deletedata/{custID}")
    public ResponseEntity<String> deletedata(@PathVariable int custId) {
        customerServiceImpl.deletedata(custId);
        return ResponseEntity.ok("Data Deleted Successfully");

    }
}

