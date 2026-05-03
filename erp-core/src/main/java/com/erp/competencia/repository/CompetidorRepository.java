package com.erp.competencia.repository;

import com.erp.competencia.domain.Competidor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@ApplicationScoped
public class CompetidorRepository {

    @PersistenceContext(unitName = "ERP_PU")
    private EntityManager em;

    public void guardar(Competidor competidor) {
        em.persist(competidor);
    }

    public Competidor buscarPorId(Long id) {
        return em.find(Competidor.class, id);
    }

    public List<Competidor> listarTodos() {
        return em.createQuery(
                "SELECT c FROM Competidor c ORDER BY c.id DESC",
                Competidor.class
        ).getResultList();
    }
}