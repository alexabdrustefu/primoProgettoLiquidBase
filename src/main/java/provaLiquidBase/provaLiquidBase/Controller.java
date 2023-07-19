package provaLiquidBase.provaLiquidBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class Controller {
  @Autowired
    private  PersonRepository personRepository;
   @PostMapping
    public String createPerson(@RequestParam String name){
       personRepository.save(new Person(name, "6,7","sada"));
        return personRepository.finByName(name)+ "salvato con successo ";
    }
    @GetMapping
    public List<Person> getPerson(){
       return (List<Person>) personRepository.findAll();
    }


}
