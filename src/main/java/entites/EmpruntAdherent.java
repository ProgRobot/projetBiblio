package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "empruntAdherent")
public class EmpruntAdherent {

    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long idEmpruntAdherent;

    @ManyToOne
    @JoinColumn(name = "idAdherent")
    private Adherent adherent;

    @OneToMany(mappedBy ="empruntAdherent" )
    List<LigneEmpruntAdherent> ligneEmpruntAdherentList;

}
