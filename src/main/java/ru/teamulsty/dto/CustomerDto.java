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
public class CustomerDto implements Serializable {

    private int id;

    private String fio;

    private String place;

    private String login;

    private String password;
}
