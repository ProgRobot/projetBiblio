package services;

import entites.Adherent;
import org.springframework.stereotype.Service;
import repositories.AdherentRepository;

import java.util.List;

@Service
public class AdherentService {

    private AdherentRepository adherentRepository;


    //CRUD
    //create(post)
    public Adherent save(Adherent adherent){
       return adherentRepository.save(adherent);
    }
    //read(get)
    public List<Adherent> adherentList(){
        return adherentRepository.findAll();
    }

    public Adherent findAdherentByID(long id){
       return adherentRepository.findById(id).orElse(null);
    }


    //update
    public void updateAdhrent(Adherent adherent){
        Adherent ancienInfoAdherent = adherentRepository.findById(adherent.getIdAdherent()).orElse(null);

        if(adherent==null){
           return;
        }

        else {
            ancienInfoAdherent.setAdresse(adherent.getAdresse());
            ancienInfoAdherent.setNom(adherent.getNom());
            ancienInfoAdherent.setPrenom(adherent.getPrenom());
            ancienInfoAdherent.setEmail(adherent.getEmail());
            ancienInfoAdherent.setImage(adherent.getImage());
            ancienInfoAdherent.setNumTelephone(adherent.getNumTelephone());


        }


    }

    //delete
    public void delete(long id){
        adherentRepository.deleteById(id);
    }
}
