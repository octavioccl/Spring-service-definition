package com.example.users.repositories;

import com.example.users.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<User,Integer>
{
}
