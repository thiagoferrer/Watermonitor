package com.waterwatch.watermonitor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "MEDICAO")

public class Medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Localização é obrigatória")
    private String localizacao;

    @Positive(message = "Consumo deve ser um valor positivo")
    private Double consumoLitros;

    @NotNull(message = "Data da medição é obrigatória")
    private LocalDate dataMedicao;

    @NotBlank(message = "Campo alerta é obrigatório")
    private String alerta;

    // Getters e Setters
}
