package ru.teamulsty.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tender")
public class Tender {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "tender_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private int id;

    @NotNull
    private String description;

    @NotNull
    private String place;

    @NotNull
    private Timestamp date;

    @NotNull
    private String pay;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "tender_contractor",
            joinColumns = @JoinColumn(name = "tender"),
            inverseJoinColumns = @JoinColumn(name = "contractor"))
    private List<Contractor> contractor;

    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;

    @OneToMany(mappedBy = "tender", cascade = CascadeType.ALL)
    private List<TenderFile> files;

    @OneToMany(mappedBy = "tender", cascade = CascadeType.ALL)
    private List<TenderMessage> messages;

    @OneToMany(mappedBy = "tender", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;
}
