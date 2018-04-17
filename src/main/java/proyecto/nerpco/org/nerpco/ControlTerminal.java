package proyecto.nerpco.org.nerpco;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveInsertOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = {"/api/terminales"})
public class ControlTerminal {

    @Autowired RepositorioTerminales repoTerm;

    //Metodo JSON para guardar Terminal
    @CrossOrigin
    @RequestMapping(value = {"/guardar"}, method = RequestMethod.POST, headers = {"Accept=application/json"})
    public Estatus guardarTerminal(@RequestBody String json)throws Exception{

        ObjectMapper mapper=new ObjectMapper();
        Terminales terminal=mapper.readValue(json,Terminales.class);

        repoTerm.save(terminal);
        return new Estatus(true,"Terminal guardada con exito");
    }

    //Metodo JSON para actualizar terminal
    @CrossOrigin
    @RequestMapping(value = {"/actualizar"}, method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizarTerminal(@RequestBody String json)throws Exception{

        ObjectMapper mapper=new ObjectMapper();
        Terminales terminales=mapper.readValue(json,Terminales.class);

        repoTerm.findById(terminales.getClaveTerminal());

        repoTerm.save(terminales);
        return new Estatus(true,"Terminal actualizada");
    }

    //Metodo json para borrar terminal
    @CrossOrigin
    @RequestMapping(value = {"/borrar"}, method = RequestMethod.DELETE, headers = {"Accept=application/json"})
    public Estatus borrarTerminal(@RequestBody String json)throws Exception{

        ObjectMapper mapper=new ObjectMapper();
        Terminales terminales=mapper.readValue(json,Terminales.class);

        repoTerm.delete(terminales);
        return new Estatus(true, "Terminal eliminada");
    }

    //Metodo JSON para buscar por ID
    @CrossOrigin
    @RequestMapping(value = {"/id"}, method = RequestMethod.GET, headers = {"Accept=application/json"})
    public Optional<Terminales> buscarTerminal(@RequestBody String json)throws Exception{

        ObjectMapper mapper=new ObjectMapper();
        Terminales terminales=mapper.readValue(json,Terminales.class);

        return repoTerm.findById(terminales.getClaveTerminal());
    }

    //buscar todos
    @CrossOrigin
    @RequestMapping(value = {"/todos"}, method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Terminales> buscartodos(){
        return (ArrayList<Terminales>)repoTerm.findAll();
    }
}
