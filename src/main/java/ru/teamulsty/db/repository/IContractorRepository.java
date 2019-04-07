package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.Contractor;

@Repository
public interface IContractorRepository extends JpaRepository<Contractor, Integer> {

    Contractor findByLogin(String login);
}
