package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "livre")
public class Livre {

    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long idLivre;

    private String ISBN;
    private String titre;
    private String auteur;
    private String image;
    private String description;

    @OneToMany(mappedBy = "livre")
    private List<LigneEmpruntAdherent> ligneEmpruntAdherentList;

    @ManyToOne
    @JoinColumn(name ="idStock" )
    private Stock stock;

    @JsonIgnore
    private Instant dateCreation;
    @JsonIgnore
    private Instant dateLastUpdate;
}
