package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class Session {

   @Id
   private UUID idSession;
   private String lastCommand;
   private String currentDir;
   private boolean lock;

   @OneToOne
    private User user;

}
