package com.genpact.cassandra.dao;


import org.springframework.data.repository.CrudRepository;

import com.genpact.cassandra.pojo.Users;


public interface UsersRepository  extends CrudRepository<Users, Integer>{
	
}
