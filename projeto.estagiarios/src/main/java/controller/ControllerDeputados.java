package controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import model.Deputados;
import repository.RepositoryDeputados;

@Path("/deputados")
public class ControllerDeputados {
    
    @Inject
    EntityManager em;
    @Inject
    RepositoryDeputados rd;

    @GET
    public List<Deputados> getAll(){
        return rd.findAll();
    }
}
