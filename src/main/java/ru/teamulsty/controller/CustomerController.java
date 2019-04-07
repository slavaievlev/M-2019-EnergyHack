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
import ru.teamulsty.dto.ContractorDto;
import ru.teamulsty.dto.CustomerDto;
import ru.teamulsty.dto.TenderDto;

import java.sql.Timestamp;

@RestController
@RequestMapping(Url.CustomerController.ROOT)
public class CustomerController {

    @Autowired
    private ICustomerRepository customerRepository;

    @PostMapping
    public String create(@RequestBody CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setLogin(customerDto.getLogin());
        customer.setPassword(customerDto.getPassword());
        customer.setFIO(customerDto.getFio());

        customerRepository.saveAndFlush(customer);
        return "admin-menu";
    }
}
