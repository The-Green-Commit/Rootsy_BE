package com.rootsy.Rootsy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "Comment")
@Getter @Setter
public class Comment {
    
    @Id
    @SequenceGenerator (name="comment_id_sequence", sequenceName = "comment_id_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "comment_id_sequence")
    private Integer id;

    @Column
    @NotBlank (message = "(!) ERROR: el campo del comentario no puede estar nulo")
    @Size (max = 1000, message = "(!) ERROR: máximo de 1000 caracteres permitidos")
    @Pattern (regexp = "^[^\\/*<>|]+$", message = "(!) ERROR: No está permitido el uso de algunos caracteres especiales")
    private String comment;

    @Column
    private String imgPath;

    //AÑADIR EL USER ID RELACIONAR
    //AÑADIR LAS RELACIONES CON LAS DEMÁS ENTIDADES

    public Comment() {};
}
