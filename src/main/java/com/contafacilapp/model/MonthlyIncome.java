package com.contafacilapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "monthlyIncome")
public class MonthlyIncome {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String salary;

    private String ticket;

    private String month;

    private String year;

    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
}
