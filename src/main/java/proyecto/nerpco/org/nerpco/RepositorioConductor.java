package proyecto.nerpco.org.nerpco;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioConductor extends MongoRepository<Conductor,String> {
}
