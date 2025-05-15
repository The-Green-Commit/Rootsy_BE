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
@Table (name="Type")
@Getter @Setter
public class Type {
    
    @Id
    @SequenceGenerator (name="type_id_sequence", sequenceName = "type_id_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "type_id_sequence")
    private Integer id;

    @Column
    @NotBlank (message = "(!) ERROR: el campo del tipo de categoría no puede estar nulo")
    @Size (max = 20, message = "(!) ERROR: máximo de 20 caracteres permitidos")
    @Pattern (regexp = "^[^\\/*<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    private String type;

    //AÑADIR RELACIÓN CON LAS DEMÁS ENTIDADES

    public Type (){};

}
