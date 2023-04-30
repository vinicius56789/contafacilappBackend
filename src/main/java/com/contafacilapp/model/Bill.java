package com.contafacilapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity(name = "bill")
public class Bill {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String value;

    private String reminder;

    private String month;

    private String year;

    private String dueDate;

    private String paid;

    private String paidMonth;

    private Boolean constant;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;

    @ManyToMany(mappedBy = "bills")
    private Set<Event> event;

}
