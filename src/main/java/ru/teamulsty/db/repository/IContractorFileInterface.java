package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.ContractorFile;

@Repository
public interface IContractorFileInterface extends JpaRepository<ContractorFile, Integer> {
}
