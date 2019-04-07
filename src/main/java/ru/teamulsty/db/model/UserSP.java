package ru.teamulsty.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "usersp")
public class UserSP {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "usersp_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private int id;

    @NotNull
    private String fio;

    @NotNull
    private String login;

    @NotNull
    private String password;
}
