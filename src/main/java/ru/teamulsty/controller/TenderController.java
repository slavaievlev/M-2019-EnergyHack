package ru.teamulsty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.teamulsty.db.model.Contractor;
import ru.teamulsty.db.model.Customer;
import ru.teamulsty.db.model.Tender;
import ru.teamulsty.db.repository.IContractorRepository;
import ru.teamulsty.db.repository.ICustomerRepository;
import ru.teamulsty.db.repository.ITenderRepository;
import ru.teamulsty.dto.SubscribeDto;
import ru.teamulsty.dto.TenderDto;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(Url.Tender.ROOT)
public class TenderController {

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private IContractorRepository contractorRepository;

    @Autowired
    private ITenderRepository tenderRepository;

    @PostMapping
    public String create(@RequestBody TenderDto tenderDto) {
        Tender newTender = new Tender();
        newTender.setDescription(tenderDto.getDescription());

        Customer customer = customerRepository.findByLogin(tenderDto.getCustomerLogin());
        newTender.setCustomer(customer);

        newTender.setDate(new Timestamp(System.currentTimeMillis()));
        newTender.setPay(tenderDto.getPay());
        newTender.setPlace(tenderDto.getPlace());

        tenderRepository.saveAndFlush(newTender);

        return null;
    }

    @PostMapping(value = Url.Tender.SUBSCRIBE)
    public String addSubscribe(@RequestBody SubscribeDto subscribeDto) {
        Tender findTender = tenderRepository.getOne(subscribeDto.getTenderId());
        Contractor findContractor = contractorRepository.findByLogin(subscribeDto.getContractorLogin());

        List<Contractor> contractors = findTender.getContractor();
        contractors.add(findContractor);
        findTender.setContractor(contractors);

        tenderRepository.saveAndFlush(findTender);
        return "tenders";
    }

    public String addFeedback(@RequestBody TenderDto tenderDto) {
        // TODO

        return null;
    }

    public String addMessage(@RequestBody TenderDto tenderDto) {
        // TODO

        return null;
    }

    public String chooseContractor(@RequestBody TenderDto tenderDto) {
        // TODO

        return null;
    }

    public String getAll(@RequestBody TenderDto tenderDto) {
        // TODO

        return null;
    }

    public String getAllMessage(@RequestBody TenderDto tenderDto) {
        // TODO

        return null;
    }

    public String getAllFeedback(@RequestBody TenderDto tenderDto) {
        // TODO

        return null;
    }

    public String chooseState(@RequestBody TenderDto tenderDto) {
        //

        return null;
    }
}
