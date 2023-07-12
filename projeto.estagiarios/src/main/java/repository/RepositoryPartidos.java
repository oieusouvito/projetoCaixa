package repository;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import model.Partidos;

public class RepositoryPartidos {
    @Inject
    EntityManager em;

    public List<Partidos> findAll(){
        return em.createQuery("SELECT d FROM Deputados d", Partidos.class).getResultList();
    }
}
