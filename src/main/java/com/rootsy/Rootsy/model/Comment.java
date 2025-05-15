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
    @NotBlank (message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Size (max = 1000, message = "(!) ERROR: maximum of 1000 characters allowed")
    @Pattern (regexp = "^[^\\/*<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    private String comment;

    @Column
    private String imgPath;

    //AÑADIR EL USER ID RELACIONAR
    //AÑADIR LAS RELACIONES CON LAS DEMÁS ENTIDADES

    public Comment() {};
}
