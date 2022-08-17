package com.contafacilapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "extraIncome")
public class ExtraIncome {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String value;

    private String name;

    private String description;

    private String month;

    private String year;

    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
}
