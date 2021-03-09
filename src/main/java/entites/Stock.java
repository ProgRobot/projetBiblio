package entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
//constructeur avec argument
@AllArgsConstructor
//constructeur sans argument
@NoArgsConstructor
//pour dire que c'est une table
@Entity
//donner un noma la table
@Table(name = "stock")

public class Stock {

    @Id
    //auto generation de la clé primaire
    @GeneratedValue
    private long idStock;

    private int quantite;

    @OneToMany(mappedBy = "stock")
    List<Livre> livreList;
}
