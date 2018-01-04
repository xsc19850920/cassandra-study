package com.genpact.cassandra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genpact.cassandra.dao.UsersRepository;
import com.genpact.cassandra.pojo.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:ApplicationContext.xml"})
public class UsersTest {
	@Autowired
	private UserService userService;
	  //@Test
	  public void selectCount(){
		  userService.selectCount();
	  }
	  
	 // @Test
	  public void insert(){
		  userService.insert();
	  }
	  
	  //@Test
	  public void update(){
		  userService.update();
	  }
	  
	  //@Test
	  public void delete(){
		  userService.delete();
	  }
	  
	  @Test
	  public void seloec(){
		  userService.selectByParam();
	  }
	  
	  
	  
	  
}
