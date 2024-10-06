package com.iteureka.semana1.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name="clientes")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerEntity  {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length=255)
    private String nombre;
    
    @Column(length=255)
    private String casaMatriz;

    @OneToMany(
        mappedBy = "cliente_id",
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.EAGER
    )
    @ToString.Exclude
    @JsonManagedReference
    private List<ProjectEntity> proyectos;
}
