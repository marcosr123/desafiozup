package br.marcosrichard.desafiozup.modells;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="UsuarioZUP")
public class Usuario {

    @Id
    @NotNull
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    @Column(name = "datanascimento")
    private Date dataNascimento;
}
