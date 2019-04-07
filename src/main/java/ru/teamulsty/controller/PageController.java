package ru.teamulsty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.teamulsty.db.model.Tender;
import ru.teamulsty.db.repository.ITenderRepository;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    private ITenderRepository tenderRepository;

    @RequestMapping(value = Url.PageRequest.AUTH, method = RequestMethod.GET)
    public String auth(Model model) {

        return "auth";
    }

    @RequestMapping(value = Url.PageRequest.ADMIN_MENU, method = RequestMethod.GET)
    public String adminMenu(Model model) {

        return "admin/admin-menu";
    }

    @RequestMapping(value = Url.PageRequest.ACCOUNT_CHOOSE, method = RequestMethod.GET)
    public String accountChoose(Model model) {

        return "admin-menu";
    }

    @RequestMapping(value = Url.PageRequest.CONTRACTOR, method = RequestMethod.GET)
    public String contractorInfo(Model model) {

        return "admin/contractor";
    }

    @RequestMapping(value = Url.PageRequest.CUSTOMER, method = RequestMethod.GET)
    public String customerInfo(Model model) {

        return "admin/customer";
    }

    @RequestMapping(value = Url.PageRequest.TENDERS)
    public String allTenders(Model model) {
        List<Tender> tenders = tenderRepository.findAll();
        model.addAttribute("tenders", tenders);

        return "contractor/contractor-menu";
    }

    @RequestMapping(value = Url.PageRequest.TENDER_INFO)
    public String aboutTender(@RequestParam(name = "id") String sId, Model model) {
        Tender tender = tenderRepository.getOne(Integer.parseInt(sId));
        model.addAttribute("tender", tender);

        return "contractor/tender-info";
    }

    @RequestMapping(value = Url.PageRequest.CUSTOMER_MENU)
    public String customerMenu(Model model) {
        List<Tender> tenders = tenderRepository.findAll();
        model.addAttribute("tenders", tenders);

        return "customer/all-tenders";
    }
}
