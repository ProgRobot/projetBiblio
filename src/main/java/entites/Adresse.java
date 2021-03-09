package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour que la table adresse soit inclut dans autre table
@Embeddable

public class Adresse  {

    private String adresse;
    private String ville;
    private String codePostale;
    private String pays;
}
