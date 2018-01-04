package com.genpact.cassandra.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@PropertySource(value="cassandra.properties")
@ComponentScan(basePackages="com.genpact.cassandra")
@EnableCassandraRepositories(basePackages="com.genpact.cassandra.dao")
public class CassandraConfiguration extends AbstractCassandraConfiguration {
		@Autowired
		private Environment env;
		
		@Autowired
		private ApplicationContext context;
		
		@Bean
	    public CassandraClusterFactoryBean cluster() {
	        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
//	        CassandraClusterFactoryBean cluster = context.getBean(CassandraClusterFactoryBean.class);
	        //
	        cluster.setContactPoints(env.getProperty("cassandra.contactpoints"));
	        cluster.setPort(new Integer(env.getProperty("cassandra.port")));
	        return cluster;
	    }

	    @Override
	    protected String getKeyspaceName() {
	        return env.getProperty("cassandra.keyspace");
	    }
	
}
