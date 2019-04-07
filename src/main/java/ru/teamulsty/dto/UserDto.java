package ru.teamulsty.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    private String login;

    private String pass;
}
