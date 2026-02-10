package tn.esprit.tp_sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.tp_sb.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
