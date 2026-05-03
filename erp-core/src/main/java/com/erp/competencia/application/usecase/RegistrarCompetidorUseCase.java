package com.erp.competencia.application.usecase;

import com.erp.competencia.application.port.CompetidorRepositoryPort;
import com.erp.competencia.domain.Competidor;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class RegistrarCompetidorUseCase {

    @Inject
    private CompetidorRepositoryPort competidorRepository;

    public void ejecutar(String nombre, String rubro, String ciudad, String direccion) {
        Competidor competidor = new Competidor(nombre, rubro, ciudad, direccion);
        competidorRepository.guardar(competidor);
    }
}