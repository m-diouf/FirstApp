package sn.malfirst.grfirst.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Commande {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numCommande;
	private String commentaire;
	private Date dateCommande;
	@ManyToOne
	private Utilisateur author;
	private String etat;
	

}
