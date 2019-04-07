package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.Tender;

@Repository
public interface ITenderRepository extends JpaRepository<Tender, Integer> {
}
