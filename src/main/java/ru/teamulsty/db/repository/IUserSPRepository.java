package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.UserSP;

@Repository
public interface IUserSPRepository extends JpaRepository<UserSP, Integer> {

    UserSP findByLogin(String login);
}
