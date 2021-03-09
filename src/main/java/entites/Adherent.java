package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;


import javax.persistence.*;
import java.time.Instant;
import java.util.List;

//getter et setter
@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "adherent")
public class Adherent {

    //pour dire que c'est id de la table
    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long idAdherent;

    private String nom;
    private String prenom;
    private String email;
    private String image;
    private String numTelephone;
    //inclure la class adresse
    @Embedded
    private Adresse adresse;

    //ignorer le contenu si envoyer par jsone
    @JsonIgnore
    private Instant dateCreation;

    @OneToMany(mappedBy = "adherent")
    private List<EmpruntAdherent> empruntAdherentList;


}
