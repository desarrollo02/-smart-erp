package com.erp.competencia.application.usecase;

import com.erp.competencia.application.dto.CompetidorDTO;
import com.erp.competencia.application.port.CompetidorRepositoryPort;
import com.erp.competencia.domain.Competidor;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class ListarCompetidoresUseCase {

    @Inject
    private CompetidorRepositoryPort competidorRepository;

    public List<CompetidorDTO> ejecutar() {
        List<Competidor> lista = competidorRepository.listarTodos();

        return lista.stream()
                .map(c -> new CompetidorDTO(
                        c.getId(),
                        c.getNombre(),
                        c.getRubro(),
                        c.getCiudad()
                ))
                .collect(Collectors.toList());
    }
}