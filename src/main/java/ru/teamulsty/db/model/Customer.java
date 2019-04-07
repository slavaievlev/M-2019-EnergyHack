package ru.teamulsty.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "customer_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private int id;

    @NotNull
    private String FIO;

    @NotNull
    private String login;

    @NotNull
    private String password;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Tender> tenders;
}
