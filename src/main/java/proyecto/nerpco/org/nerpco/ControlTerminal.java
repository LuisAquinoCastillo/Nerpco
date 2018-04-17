package proyecto.nerpco.org.nerpco;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin
    @RequestMapping(value = {"/actualizar"}, method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizarTerminal(@RequestBody String json)throws Exception{

        ObjectMapper mapper=new ObjectMapper();
        Terminales terminales=mapper.readValue(json,Terminales.class);

        repoTerm.findById(terminales.getClaveTerminal());

        repoTerm.save(terminales);
        return new Estatus(true,"Terminal actualizada");
    }
}
