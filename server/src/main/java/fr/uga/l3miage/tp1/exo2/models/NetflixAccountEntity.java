package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {

    @Id
    @Column
    private Integer id;

    @Column
    private Integer nb_device;

   @Column
   @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

   @Column
   private String uuid_user;

    @OneToOne(mappedBy = "account")
    private NetflixUserEntity user;
}

