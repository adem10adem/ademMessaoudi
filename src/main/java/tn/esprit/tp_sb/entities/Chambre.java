package tn.esprit.tp_sb.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tp_sb.enums.TypeChambre;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString(includeFieldNames = false)
@EqualsAndHashCode(exclude = {"idChambre","reservations"})
@NoArgsConstructor
@AllArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;


    @OneToMany
    List<Reservation> reservations;



}
