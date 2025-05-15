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
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 30, message = "(!) ERROR: maximum of 30 characters allowed")
    private String plantName;

    @Column
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 150, message = "(!) ERROR: maximum of 150 characters allowed")
    private String description;

    @Column
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 50, message = "(!) ERROR: maximum of 50 characters allowed")
    private String lightConditions;

    @Column
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 50, message = "(!) ERROR: maximum of 50 characters allowed")
    private String watering;

    @Column
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 50, message = "(!) ERROR: maximum of 50 characters allowed")
    private String humidity;

    @Column
    @NotBlank(message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Pattern(regexp = "^[^\\/:*?\\\"<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    @Size(max = 50, message = "(!) ERROR: maximum of 50 characters allowed")
    private String temperature;

    @Column
    @NotBlank (message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    private Boolean petfriendly;

    @Column
    private String imgPath;

    //AÑADIR RELACIONES - TYPE_ID, FAMILY_ID

    public Plant(){};

}
