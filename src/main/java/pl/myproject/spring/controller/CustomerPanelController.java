package pl.myproject.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.myproject.spring.model.Customer;
import pl.myproject.spring.services.CustomerServices;

import javax.validation.Valid;


@Controller
public class CustomerPanelController {

    @Autowired
    private CustomerServices customerServices;

    @RequestMapping(value = "/customerCreateAccount", method = RequestMethod.GET)
    public String goToRegisterPanel(Model model) {

        model.addAttribute("customer", new Customer());
        return "CustomerPanel/RegisterPanel";
    }

    @RequestMapping(value = "customer/createAccount", method = RequestMethod.POST)
    public String registerAccount(@Valid Customer customer, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "CustomerPanel/RegisterPanel";
        } else {
            customerServices.createCustomerAccount(customer);
            model.addAttribute("registerInfo", "Rejestracja zako�czy�a si� pomy�lnie");
            return "CustomerPanel/RegisterPanel";
        }
    }

    @RequestMapping(value = "/LoginCustomer", method = RequestMethod.GET)
    public String goToLoginPanel() {

        return "CustomerPanel/LoginPanel";
    }
}
