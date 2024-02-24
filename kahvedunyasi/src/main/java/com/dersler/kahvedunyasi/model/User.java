package com.dersler.kahvedunyasi.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="birth_year")
    private int birthOfDateYear;

    @Column(name="identity_no")
    private String identityNumber;

    @Column(name="E_Mail")
    private String email;

}
