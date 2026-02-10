package tn.esprit.tp_sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tp_sb.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
