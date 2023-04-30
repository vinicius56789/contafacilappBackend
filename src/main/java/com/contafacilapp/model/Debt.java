package com.contafacilapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "debt")
public class Debt {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    private String monthlyInterest;

    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;

}
