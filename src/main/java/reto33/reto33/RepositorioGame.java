/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto33.reto33;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hguti
 */
@Repository
public class RepositorioGame {
    
    @Autowired
    private InterfaceGame crud;

    public List<Game> getAll(){
        return (List<Game>) crud.findAll();
    }

    public Optional<Game> getGame(int id){
        return crud.findById(id);
    }

    public Game save(Game game){
        return crud.save(game);
    }
    public void delete(Game game){
        crud.delete(game);
    }
    
}
