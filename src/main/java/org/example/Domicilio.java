package org.example;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "domicilio")
@Builder
@Getter
@Setter
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombreCalle")
    private String nombreCalle;
    @Column(name = "numero")
    private int numero;
    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;
}
