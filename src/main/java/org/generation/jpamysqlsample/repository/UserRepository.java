package org.generation.jpamysqlsample.repository;

import org.generation.jpamysqlsample.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository

public interface UserRepository
    extends CrudRepository<User, Integer>
{
    ArrayList<User> findByName(String name); //busca a persona por nombre, se enlaza a base de datos para buscar :v

}
