package sn.malfirst.grfirst.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.malfirst.grfirst.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
