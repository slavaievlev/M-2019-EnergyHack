package ru.teamulsty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.teamulsty.db.model.Contractor;
import ru.teamulsty.db.model.Tender;
import ru.teamulsty.db.repository.IContractorRepository;
import ru.teamulsty.dto.ContractorDto;
import ru.teamulsty.dto.TenderDto;

@RestController
@RequestMapping(Url.ContractorController.ROOT)
public class ContractorController {

    @Autowired
    private IContractorRepository contractorRepository;

    @PostMapping
    public String create(@RequestBody ContractorDto contractorDto) {
        Contractor newContractor = new Contractor();
        newContractor.setLogin(contractorDto.getLogin());
        newContractor.setPassword(contractorDto.getPassword());
        newContractor.setPersonsAndTrainingAbout(contractorDto.getPersonsAndTrainingAbout());
        newContractor.setTechnicalAbout(contractorDto.getTechnicalAbout());

        contractorRepository.saveAndFlush(newContractor);
        return "admin-menu";
    }
}
