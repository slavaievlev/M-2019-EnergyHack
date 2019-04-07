package ru.teamulsty.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.teamulsty.db.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByLogin(String login);
}
