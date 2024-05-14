package com.dev.back.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;


@Entity
@Table(name = "estado")
@Data

public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nome;
    private String sigla;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataAtt;

}
