package cesde.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Comentario")
public class Comentario {
    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "texto")
    private Sting texto = "";

    @Column(name = "autor")
    private String autor = "";

    @Column(name = "fecha")
    private String fecha = "";
}