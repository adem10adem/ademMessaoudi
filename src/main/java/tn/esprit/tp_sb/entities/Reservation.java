package tn.esprit.tp_sb.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation {
    @Id
    private String idReservation;

    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany
    List<Etudiant> etudiants;

}
