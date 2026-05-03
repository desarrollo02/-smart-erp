package com.erp.competencia.service;

import com.erp.competencia.domain.Competidor;
import com.erp.competencia.repository.CompetidorRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class CompetidorService {

    @Inject
    private CompetidorRepository competidorRepository;

    public void registrarCompetidor(String nombre, String rubro, String ciudad, String direccion) {
        Competidor competidor = new Competidor(nombre, rubro, ciudad, direccion);
        competidorRepository.guardar(competidor);
    }

    public List<Competidor> listarCompetidores() {
        return competidorRepository.listarTodos();
    }
}