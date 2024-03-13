package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {

    @Id
    private Integer id;

    private Integer nb_device;

    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    private String uuid_user;

    @OneToOne(mappedBy = "account")
    private NetflixUserEntity user;
}

