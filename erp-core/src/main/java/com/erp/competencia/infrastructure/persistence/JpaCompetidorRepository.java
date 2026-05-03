package com.erp.competencia.infrastructure.persistence;

import com.erp.competencia.application.port.CompetidorRepositoryPort;
import com.erp.competencia.domain.Competidor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@ApplicationScoped
public class JpaCompetidorRepository implements CompetidorRepositoryPort {

    @PersistenceContext(unitName = "ERP_PU")
    private EntityManager em;

    @Override
    public void guardar(Competidor competidor) {
        em.persist(competidor);
    }

    @Override
    public Competidor buscarPorId(Long id) {
        return em.find(Competidor.class, id);
    }

    @Override
    public List<Competidor> listarTodos() {
        return em.createQuery(
                "SELECT c FROM Competidor c ORDER BY c.id DESC",
                Competidor.class
        ).getResultList();
    }
}