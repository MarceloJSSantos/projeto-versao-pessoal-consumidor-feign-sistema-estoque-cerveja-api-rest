package com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CervejaDTO {

    private Long id;

    private String nome;

    private String marca;

    private Integer quantMax;

    private Integer quantidade;

    private String tipo;
}
