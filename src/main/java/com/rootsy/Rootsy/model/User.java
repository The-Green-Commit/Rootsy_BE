package com.rootsy.Rootsy.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "User")
@Getter @Setter
public class User {
    
    @Id
    @SequenceGenerator(name = "user_id_sequence", sequenceName = "user_id_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_sequence")
    private Integer id;

    @Column
    @NotBlank(message = "(!) ERROR: El campo de nombre no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 20, message = "(!) ERROR: Máximo de 20 caracteres permitidos en este campo")
    private String username;

    @Column
    @Email(message = "(!) ERROR: Por favor, ingrese un formato válido de email")
    @NotBlank(message = "(!) ERROR: El campo de email no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 50, message = "(!) ERROR: Máximo de 50 caracteres permitidos en este campo")
    private String email;

    //AÑADIR RELACIONES CON LAS DEMÁS ENTIDADES

    public User() {};

}
