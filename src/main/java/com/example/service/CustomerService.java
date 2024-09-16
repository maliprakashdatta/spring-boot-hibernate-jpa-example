package com.example.service;
import com.example.model.CustomerModel;
import java.util.List;

public interface CustomerService {

    CustomerModel saveCustomer(CustomerModel customer);

    boolean deleteCustomer(final Long customerId);
    List<CustomerModel> getAllCustomers();
    CustomerModel getCustomerById(final Long customerId);

}
