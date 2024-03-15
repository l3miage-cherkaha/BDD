package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="netflix_user")
public class NetflixUserEntity {

    @Id
    @Column
    private Integer id;

    @Column
    private String uuid;

    @Column
    private String lastname;

    @Column
    private String firstname;

    @Column
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column
    private LocalDate birthDate;

    @OneToOne
    private NetflixAccountEntity account;

}
