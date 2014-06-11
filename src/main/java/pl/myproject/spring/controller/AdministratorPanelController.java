package pl.myproject.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.myproject.spring.model.Hairstylist;
import pl.myproject.spring.services.AdministratorServices;

import javax.validation.Valid;


@Controller
public class AdministratorPanelController {

    @Autowired
    private AdministratorServices adminServices;


    @RequestMapping(value = "/LoginAdmin", method = RequestMethod.GET)
    public ModelAndView login() {

        ModelAndView model = new ModelAndView();

        model.setViewName("AdminPanel/LoginPanel");

        return model;
    }

    @RequestMapping(value = "/admin/reportsPanel")
    public String gotToReportsPanel(Model model) {

        model.addAttribute("ReportsList", adminServices.getReports());

        return "AdminPanel/ReportsPanel";
    }

    @RequestMapping(value = "/admin/reportsPanel/accept/{id}", method = RequestMethod.GET)
    public String acceptAccount(@PathVariable(value = "id") Integer customerId, Model model) {

        adminServices.acceptReports(customerId);
        gotToReportsPanel(model);
        return "AdminPanel/ReportsPanel";
    }

    @RequestMapping(value = "/admin/reportsPanel/reject/{id}", method = RequestMethod.GET)
    public String rejectAccount(@PathVariable(value = "id") Integer customerId, Model model) {

        adminServices.rejectReports(customerId);
        gotToReportsPanel(model);
        return "AdminPanel/ReportsPanel";
    }

    @RequestMapping(value = "/admin/registerHairstylist")
    public String goToHairstylistRegisterPanel(Model model) {

        model.addAttribute("hairstylist", new Hairstylist());

        return "AdminPanel/RegisterPanel";
    }

    @RequestMapping(value = "/admin/registerHairstylist", method = RequestMethod.POST)
    public String registerHairstylist(@Valid Hairstylist hairstylist, BindingResult br) {

        if (br.hasErrors()) {
            return "AdminPanel/RegisterPanel";
        } else {
            adminServices.createNewHairstylist(hairstylist);
            return "AdminPanel/PrimaryPanel";
        }
    }
}
