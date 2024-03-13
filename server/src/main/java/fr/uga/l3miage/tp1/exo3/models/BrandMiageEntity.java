package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table(name)
public class BrandMiageEntity {
    @Id
    private String company_name;

    private String siretNumber;

    private String type; //BrandType

    @OneToMany
    private Set<ProductEntity> products

   @ManyToOne
   private BrandMiageEntity brand ; // in product_entity

}
