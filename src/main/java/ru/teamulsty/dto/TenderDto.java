package ru.teamulsty.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
public class TenderDto implements Serializable {

    private int id;

    private String description;

    private String place;

    private Timestamp date;

    private String pay;

    private String contractorLogin;

    private String customerLogin;
}
