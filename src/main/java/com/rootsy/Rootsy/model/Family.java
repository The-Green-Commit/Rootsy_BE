package com.rootsy.Rootsy.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "Family")
@Getter @Setter
public class Family {

    @Id
    @SequenceGenerator (name="family_id_sequence", sequenceName = "family_id_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "family_id_sequence")
    private Integer id;

    @Column
    @NotBlank (message = "(!) ERROR: this field cannot be blank nor have blank spaces")
    @Size (max = 20, message = "(!) ERROR: maximum of 20 characters allowed")
    @Pattern (regexp = "^[^\\/*<>|]+$", message = "(!) ERROR: some special characters aren't allowed")
    private String family;

    @OneToMany(mappedBy = "family")
    @JsonIgnore
    private List<Plant> plants;

    public Family(){};

}
