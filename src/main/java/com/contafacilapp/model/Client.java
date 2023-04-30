package com.contafacilapp.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "client")
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique=true)
    @NotNull
    private String email;

    private String age;

    private String occupation;

    private String password;

    @OneToMany(mappedBy = "client")
    private List<MonthlyIncome> monthlyIncome;

    @OneToMany(mappedBy = "client")
    private List<ExtraIncome> extraIncome;

    @OneToMany(mappedBy = "client")
    private List<Debt> debt;

    @OneToMany(mappedBy = "client")
    private List<Bill> bill;

    @OneToMany(mappedBy = "client")
    private List<Event> event;

}
