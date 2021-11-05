package org.generation.jpamysqlsample.controller;


import org.generation.jpamysqlsample.model.User;
import org.generation.jpamysqlsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin( "*" )
@RestController
public class UserController
{

    public UserController( @Autowired UserService userService )
    {
        this.userService = userService;
    }

    private final UserService userService;

    @GetMapping( "/user/{id}" )
    public User getUser( @PathVariable Integer id )
    {
        return userService.getUser( id );
    }



    @PostMapping( "/user" )
    public User newUser( @RequestBody User user )
    {

        return userService.save( user );
    } //sirve para guardar usuarios

    @PutMapping( "/user" )
    public User updateUser( @RequestBody User user )
    {
        return userService.save( user );
    }

    @DeleteMapping( "/user/{id}" )
    public void deleteUser( @PathVariable Integer id )
    {
        userService.delete( id );
    }

    //buscar por id
    @GetMapping( "/user/search/{name}" )
    public ArrayList<User> getUserSearch (@PathVariable String name)
    {
        return userService.findByName( name );
    }

    @GetMapping ("/user")
    public String saludo(){
        return "ola k ase";
    }



}
