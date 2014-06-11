package pl.myproject.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.myproject.spring.model.Customer;
import pl.myproject.spring.model.Hairstylist;
import pl.myproject.spring.resources.CustomerResources;
import pl.myproject.spring.resources.HairstylistResources;

import java.util.List;

@Service
public class AdministratorServices {

    @Autowired
    private CustomerResources customerResources;
    @Autowired
    private HairstylistResources hairstylistResources;

    public List<Customer> getReports() {

        return customerResources.getAccountWaitingForVerifiedList();
    }

    public void rejectReports(int id) {

        customerResources.deleteReportsFromDatabase(id);
    }

    public void acceptReports(int id) {

        customerResources.createCustomerAccount(findAccountWithId(id).buildCustomerMap());
        customerResources.deleteReportsFromDatabase(id);
    }

    public void createNewHairstylist(Hairstylist hairstylist) {

        hairstylistResources.createHairstylistAccount(hairstylist.buildMap());
    }


    private Customer findAccountWithId(int id) {

        List<Customer> l = customerResources.getAccountWaitingForVerifiedList();

        for (Customer s : l) {

            if (s.getId() == id) return s;
        }
        return new Customer();
    }
}
