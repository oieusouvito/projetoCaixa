package repository;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import model.Deputados;

public class RepositoryDeputados {
    @Inject
    EntityManager em;

    public List<Deputados> findAll(){
        return em.createQuery("SELECT d FROM Deputados d", Deputados.class).getResultList();
    }
}
