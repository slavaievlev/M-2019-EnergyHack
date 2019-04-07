package ru.teamulsty.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "Feedback")
public class Feedback {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "feedback_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private int id;

    @NotNull
    private String text;

    @ManyToOne
    @JoinColumn(name = "tender")
    private Tender tender;
}
