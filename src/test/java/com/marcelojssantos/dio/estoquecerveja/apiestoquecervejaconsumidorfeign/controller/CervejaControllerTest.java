package com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.controller;

import com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign.dto.CervejaDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CervejaController.class)
@ExtendWith(SpringExtension.class)
class CervejaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    CervejaController cervejaController;

    @Test
    @DisplayName("Solicitado uma lista de cerveja, deve retornar a lista com todas as cervejas")
    void quandoRequisitadoListaCervejaDeveRetornarListaCerveja() throws Exception {
        var listaCervejaResultado = new ArrayList<CervejaDTO>();
        var cervejaDTO = CervejaDTO.builder().id(1L).nome("Brahma").build();
        listaCervejaResultado.add(cervejaDTO);

        Mockito.when(cervejaController.listaCervejas()).thenReturn(listaCervejaResultado);

        mockMvc.perform(get("/consumidor/api/v1/cervejas/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string(containsString("Brahma")));;
    }

}