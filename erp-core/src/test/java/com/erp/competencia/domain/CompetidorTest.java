package com.erp.competencia.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompetidorTest {

    @Test
    void alCrearCompetidorDebeEstarActivoYConFechaRegistro() {
        Competidor competidor = new Competidor(
                "Supermercado El Ahorro",
                "Supermercado",
                "Asunción",
                "Av. Principal 123"
        );

        assertTrue(competidor.getActivo());
        assertNotNull(competidor.getFechaRegistro());
    }

    @Test
    void desactivarDebeCambiarActivoAFalso() {
        Competidor competidor = new Competidor(
                "Farmacia Central",
                "Farmacia",
                "Luque",
                "Centro"
        );

        competidor.desactivar();

        assertFalse(competidor.getActivo());
    }
}