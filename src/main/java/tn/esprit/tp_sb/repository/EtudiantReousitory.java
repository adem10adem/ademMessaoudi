package tn.esprit.tp_sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_sb.entities.Etudiant;

public interface EtudiantReousitory extends JpaRepository<Etudiant,Long> {
}
