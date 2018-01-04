package com.genpact.cassandra;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genpact.cassandra.config.CassandraConfiguration;
import com.genpact.cassandra.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
//指定运行时候加载的配置类
@SpringApplicationConfiguration(classes = CassandraConfiguration.class)
public class CassandraSpringBootApplicationTests {
	@Autowired 
	private UserService userService;
	
	


}
