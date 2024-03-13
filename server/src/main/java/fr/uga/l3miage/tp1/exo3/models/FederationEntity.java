package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FederationEntity {
    @Id
    private String name;

    private booleanisFageMembership

    @OneToMany
    private Set<AssociationEntity> associations;
}

