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
@Table (name = "Plant")
@Getter @Setter
public class Plant {
    
    @Id
    @SequenceGenerator (name="plant_id_sequence", sequenceName = "plant_id_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "plant_id_sequence")
    private Integer id;

    @Column
    @NotBlank(message = "(!) ERROR: El campo de nombre de la planta no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 30, message = "(!) ERROR: Máximo de 30 caracteres permitidos en este campo")
    private String plantName;

    @Column
    @NotBlank(message = "(!) ERROR: El campo de la descripción no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 150, message = "(!) ERROR: Máximo de 150 caracteres permitidos en este campo")
    private String description;

    @Column
    @NotBlank(message = "(!) ERROR: El campo de la luminosidad no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 50, message = "(!) ERROR: Máximo de 50 caracteres permitidos en este campo")
    private String lightConditions;

    @Column
    @NotBlank(message = "(!) ERROR: El campo del riego no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 50, message = "(!) ERROR: Máximo de 50 caracteres permitidos en este campo")
    private String watering;

    @Column
    @NotBlank(message = "(!) ERROR: El campo de nombre no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 50, message = "(!) ERROR: Máximo de 50 caracteres permitidos en este campo")
    private String humidity;

    @Column
    @NotBlank(message = "(!) ERROR: El campo de nombre no puede estar vacio y tampoco tener espacios")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: No está permitido el uso de caracteres especiales")
    @Size(max = 50, message = "(!) ERROR: Máximo de 50 caracteres permitidos en este campo")
    private String temperature;

    @Column
    @NotBlank (message = "(!) ERROR: El campo de nombre no puede estar vacio y tampoco tener espacios")
    private Boolean petfriendly;

    @Column
    private String imgPath;

    //AÑADIR RELACIONES - TYPE_ID, FAMILY_ID

    public Plant(){};

}
