package ru.teamulsty.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractorDto implements Serializable {

    private int id;

    private String personsAndTrainingAbout;

    private String technicalAbout;

    private String login;

    private String password;
}
