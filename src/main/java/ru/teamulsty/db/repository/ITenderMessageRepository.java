package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.TenderMessage;

@Repository
public interface ITenderMessageRepository extends JpaRepository<TenderMessage, Integer> {
}
