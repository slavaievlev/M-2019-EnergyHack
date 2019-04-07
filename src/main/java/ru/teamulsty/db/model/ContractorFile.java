package ru.teamulsty.db.model;

import lombok.Getter;
import lombok.Setter;
import ru.teamulsty.db.model.enums.ContractorFileType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "contractor_file")
public class ContractorFile {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "contractor_file_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private int id;

    @NotNull
    private String path;

    @NotNull
    private String name;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private ContractorFileType type;

    @ManyToOne
    @JoinColumn(name = "contractor")
    private Contractor contractor;
}
