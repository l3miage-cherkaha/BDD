package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nb_device")
    private Integer nb_device;

    @Column(name = "typeAccount")
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    @Column(name="uuid_user")
    private String uuid_user;

    @OneToOne(mappedBy = "user")
    private NetflixUserEntity user;

}

