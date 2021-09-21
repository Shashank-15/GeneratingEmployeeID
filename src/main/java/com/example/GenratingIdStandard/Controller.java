package com.example.GenratingIdStandard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class Controller {
    @Autowired
    private EntityRepository repository;

    @Autowired
    private  EntityService entityService;

    @GetMapping("/showid")
    public List<Model> entityId(){
        return entityService.fetchId();
    }

    @PostMapping("/employee")
    public Model createEmployee(@RequestBody Model employee) {

        return repository.save(employee);
    }

}
