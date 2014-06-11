package pl.myproject.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.myproject.spring.model.Customer;
import pl.myproject.spring.resources.CustomerResources;

@Service
public class CustomerServices {

    @Autowired
    private CustomerResources customerResources;

    public void createCustomerAccount(Customer customer) {

        customerResources.addAccountToAccountsWaitingForVerified(customer.buildCustomerMap());
    }
}
