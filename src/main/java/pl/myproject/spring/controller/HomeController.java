package pl.myproject.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {

        return "home";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String goToAdministratorPanel() {

        return "AdminPanel/PrimaryPanel";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String goToCustomerPanel() {

        return "CustomerPanel/PrimaryPanel";
    }

    @RequestMapping(value = "/hairstylist", method = RequestMethod.GET)
    public String goToHairstylistPanel() {

        return "HairstylistPanel/PrimaryPanel";
    }

}
