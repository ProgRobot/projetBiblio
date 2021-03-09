package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "ligneEmpruntAdherent")
public class LigneEmpruntAdherent {

    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long idLigneEmpruntAdherent;

    @JsonIgnore
    private Instant dateidLigneEmpruntAdherent;

    @ManyToOne
    @JoinColumn(name = "idEmpruntAdherent")
    private EmpruntAdherent empruntAdherent;

    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livre livre;
}
