package sn.malfirst.grfirst.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Utilisateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String email;
	@ManyToOne
	private Profil profil;
	@OneToMany(mappedBy = "author")
	private List<Commande> commandes;
	
	@OneToMany(mappedBy = "responsable")
	private List<Utilisateur> utilisateurs;
	
	@OneToMany(mappedBy = "commande")
	private List<Commande> validationCommandes;
	
	
	
	
	
	
}
