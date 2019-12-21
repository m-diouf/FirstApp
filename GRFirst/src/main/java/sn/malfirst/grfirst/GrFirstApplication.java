package sn.malfirst.grfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.malfirst.grfirst.dao.ProfilRepository;
import sn.malfirst.grfirst.dao.UtilisateurRepository;
import sn.malfirst.grfirst.entities.Profil;
import sn.malfirst.grfirst.entities.Utilisateur;

@SpringBootApplication
public class GrFirstApplication implements CommandLineRunner{

	@Autowired
	UtilisateurRepository uRepo;
	@Autowired
	ProfilRepository profilRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GrFirstApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//uRepo.save(new Utilisateur("DIOUF","Mamadou","moth","passer","email@moth.fr"));
		uRepo.save(new Utilisateur("NIANG","Malick","first","passer","email@dhjhf.fr"));
		uRepo.save(new Utilisateur("NIANG","Malick","first","passer","email@dhjhf.fr"));
	    
    	uRepo.findAll().forEach(p->{
			System.out.println(p.getNom());
		}); 
		
	
		profilRepository.save(new Profil("Responsable", "Commantaire....."));
		profilRepository.save(new Profil("Administrateur", "Commantaire....."));
		
		profilRepository.findAll().forEach(p->{
			System.out.println(p.getCode());
		}); 
	}
	


}
