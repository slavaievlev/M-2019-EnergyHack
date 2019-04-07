package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.TenderFile;

@Repository
public interface ITenderFileRepository extends JpaRepository<TenderFile, Integer> {
}
