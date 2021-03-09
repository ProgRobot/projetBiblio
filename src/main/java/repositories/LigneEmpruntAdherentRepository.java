package repositories;

import entites.LigneEmpruntAdherent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneEmpruntAdherentRepository extends JpaRepository<LigneEmpruntAdherent,Long> {
}
