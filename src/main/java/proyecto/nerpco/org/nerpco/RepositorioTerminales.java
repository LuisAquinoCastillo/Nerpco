package proyecto.nerpco.org.nerpco;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioTerminales extends MongoRepository<Terminales,String> {
}
