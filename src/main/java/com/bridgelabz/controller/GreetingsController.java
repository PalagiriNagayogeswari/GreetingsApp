package com.bridgelabz.controller;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingsController {
    @Autowired
    GreetingService greetingService;
    @PostMapping("/addGreeting")
    public int addGreeting(@RequestBody Greeting greeting){
        return greetingService.addGreeting(greeting);
    }

    @GetMapping("/getGreetings")
    public List<Greeting> findALL(){
        return greetingService.findAll();
    }

    @PatchMapping("/updateGreetingMessage/{id}")
    public List<Greeting> update(@PathVariable("id") int id,@RequestBody Greeting greeting){
        return greetingService.update(id,greeting);
    }

    @DeleteMapping("/deleteGreeting/{id}")
    public int delete(@PathVariable("id") int id){
        return greetingService.delete(id);
    }

    @GetMapping("/getById/{id}")
    public Greeting getById(@PathVariable("id")int id){
        return greetingService.getById(id);
    }

    @GetMapping("/getByUser")
    public List<Greeting> getByUser(@RequestParam("name") String user){
        return greetingService.getByUser(user);
    }

    @PostMapping("/addGreetings")
    public int[][] addgreetings(@RequestBody List<Greeting> greetings){
        return greetingService.addgreetings(greetings);
    }
}
