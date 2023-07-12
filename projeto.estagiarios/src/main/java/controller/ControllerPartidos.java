package controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import model.Partidos;
import repository.RepositoryPartidos;

@Path("/partidos")
public class ControllerPartidos {
    @Inject
    EntityManager em;
    @Inject
    RepositoryPartidos rp;

    @GET
    public List<Partidos> getAll(){
        return rp.findAll();
    }
}
