package com.genpact.cassandra.dao;


import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.genpact.cassandra.pojo.Users;


public interface UsersRepository  extends CrudRepository<Users, Integer>{
	 @Query("select * from users where lname = ?0 ")
	 List<Users> findByLname(String lname);
}
