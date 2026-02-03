
package tn.esprit.tp_sb.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambres;
}
