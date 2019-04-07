package ru.teamulsty.db.model;

import lombok.Getter;
import lombok.Setter;
import ru.teamulsty.db.model.enums.TenderFileType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "tender_file")
public class TenderFile {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "tender_file_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private int id;

    @NotNull
    private String path;

    @NotNull
    private String name;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private TenderFileType type;

    @ManyToOne
    @JoinColumn(name = "tender")
    private Tender tender;
}
