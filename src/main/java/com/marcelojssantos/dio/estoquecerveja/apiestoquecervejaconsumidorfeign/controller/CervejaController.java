package com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.controller;

import com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.dto.CervejaDTO;
import com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.feign.ICervejaConsumidorFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consumidor/api/v1/cervejas")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CervejaController {

    @Autowired
    private ICervejaConsumidorFeign icervejaConsumidorFeign;

    @GetMapping
    public List<CervejaDTO> listaCervejas() {
        return icervejaConsumidorFeign.listaCervejas();
    }

    @GetMapping("/{nome}")
    public CervejaDTO encontraPorNome(@PathVariable String nome){
        return icervejaConsumidorFeign.encontraPorNome(nome);
    }

}
