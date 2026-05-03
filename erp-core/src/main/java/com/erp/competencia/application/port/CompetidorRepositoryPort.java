package com.erp.competencia.application.port;

import com.erp.competencia.domain.Competidor;

import java.util.List;

public interface CompetidorRepositoryPort {

    void guardar(Competidor competidor);

    Competidor buscarPorId(Long id);

    List<Competidor> listarTodos();
}