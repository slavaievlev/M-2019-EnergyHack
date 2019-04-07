package ru.teamulsty.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubscribeDto implements Serializable {

    private String contractorLogin;
    private int tenderId;
}
