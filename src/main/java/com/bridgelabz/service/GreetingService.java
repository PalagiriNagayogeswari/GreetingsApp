package com.bridgelabz.service;

import com.bridgelabz.DAO.GreetingsDAO;
import com.bridgelabz.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    GreetingsDAO greetingsDAO;
    public int addGreeting(Greeting greeting){
        return greetingsDAO.addGreeting(greeting);
    }

    public List<Greeting> findAll(){
        return greetingsDAO.findAll();
    }

    public List<Greeting> update(int id,Greeting greeting){
        return greetingsDAO.update(id,greeting);
    }

    public int delete(int id){
        return greetingsDAO.delete(id);
    }

    public Greeting getById(int id){
        return greetingsDAO.getById(id);
    }

    public List<Greeting> getByUser(String user){
        return greetingsDAO.getByUser(user);
    }

    public int[][] addgreetings(List<Greeting> greetings){
        return greetingsDAO.addgreetings(greetings);
    }
}
