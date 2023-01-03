package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repo.Customerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl {
    @Autowired
    Customerrepo CustomerrepoImpl;

    public Customer saveData(Customer customer) {
        return CustomerrepoImpl.save(customer);
    }

    public List<Customer> getAllData() {
        return CustomerrepoImpl.findAll();
    }

    public Customer updateData(Customer customer) {
        return CustomerrepoImpl.save(customer);
    }

    public void deletedata(int custID) {
        CustomerrepoImpl.deleteById(custID);
    }

}
