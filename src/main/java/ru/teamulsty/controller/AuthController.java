package ru.teamulsty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.teamulsty.db.model.Contractor;
import ru.teamulsty.db.model.Customer;
import ru.teamulsty.db.model.UserSP;
import ru.teamulsty.db.repository.IContractorRepository;
import ru.teamulsty.db.repository.ICustomerRepository;
import ru.teamulsty.db.repository.IUserSPRepository;
import ru.teamulsty.dto.UserDto;

@RestController
@RequestMapping(Url.AuthRequest.ROOT)
public class AuthController {

    private IUserSPRepository userSPRepository;
    private IContractorRepository contractorRepository;
    private ICustomerRepository customerRepository;

    @Autowired
    public AuthController(IUserSPRepository userSPRepository,
                          IContractorRepository contractorRepository,
                          ICustomerRepository customerRepository) {
        this.userSPRepository = userSPRepository;
        this.contractorRepository = contractorRepository;
        this.customerRepository = customerRepository;
    }

    @PostMapping(value = Url.AuthRequest.LOGIN)
    public String authorization(@RequestBody UserDto userDto) {
        UserSP findUserSP = userSPRepository.findByLogin(userDto.getLogin());
        if (findUserSP != null) {
            return "admin-menu";
        }

        Contractor findContractor = contractorRepository.findByLogin(userDto.getLogin());
        if (findContractor != null) {
            return "tenders";
        }

        Customer findCustomer = customerRepository.findByLogin(userDto.getLogin());
        if (findCustomer != null) {
            return "customer-menu";
        }

        return null;
    }

    @PostMapping(value = Url.AuthRequest.REGISTRATION)
    public String registration(@RequestBody UserDto userDto) {
        return null;
    }
}
