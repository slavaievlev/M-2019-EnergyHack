package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Integer> {
}
