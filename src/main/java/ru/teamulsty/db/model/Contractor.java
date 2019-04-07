package ru.teamulsty.db.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "contractor")
public class Contractor {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "contractor_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private int id;

    @NotNull
    private String personsAndTrainingAbout;

    @NotNull
    private String technicalAbout;

    @NotNull
    private String login;

    @NotNull
    private String password;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "tender_contractor",
            joinColumns = @JoinColumn(name = "contractor"),
            inverseJoinColumns = @JoinColumn(name = "tender"))
    private List<Tender> tenders;

    @OneToMany(mappedBy = "contractor", cascade = CascadeType.ALL)
    private List<ContractorFile> files;
}
