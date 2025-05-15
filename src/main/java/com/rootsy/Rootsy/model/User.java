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
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 20, message = "(!) ERROR: maximum of 20 characters allowed")
    private String username;

    @Column
    @Email(message = "(!) ERROR: invalid email format")
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 50, message = "(!) ERROR: maximum of 50 characters allowed")
    private String email;

    //AÑADIR RELACIONES CON LAS DEMÁS ENTIDADES

    public User() {};

}
