package sn.malfirst.grfirst.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Profil {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String role;
	@OneToMany(mappedBy = "profil")
	private List<Utilisateur> utilisateurs;
	
}
