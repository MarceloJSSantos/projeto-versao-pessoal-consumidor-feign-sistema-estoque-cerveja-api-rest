package com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.feign;

import com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.dto.CervejaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="cerveja", url="http://localhost:8080/api/v1/cervejas")
public interface ICervejaConsumidorFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    List<CervejaDTO> listaCervejas();

    @RequestMapping(method = RequestMethod.GET, value = "/{nome}")
    CervejaDTO encontraPorNome(@PathVariable String nome);
}
