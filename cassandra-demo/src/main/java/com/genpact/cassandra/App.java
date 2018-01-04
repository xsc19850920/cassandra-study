package com.genpact.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.sun.xml.internal.ws.Closeable;

/**
 * Hello cassandra!
 *
 */
public class App 
{
	
	private static Cluster cluster;
	private static Session session;
	
	
    public static void main( String[] args )
    {
    	//update();
    	search();
    	

    }
    
    private static void update(){
    	init();
    	// update one record into the users table
    	session.execute("update users set lname='xc' where user_id = 1747");
    	
    	close();
    }
    private static void add(){
    	init();
    	// Insert one record into the users table
    	session.execute("INSERT INTO users (user_id, fname, lname) VALUES ('1748', 'Austin', 'Bob')");
    	close();
    }
    
    private static void search(){
    	init();
    	ResultSet sets = session.execute("SELECT * FROM users");
    	for (Row row : sets) {
			System.out.format("user_id:%d,fname:%s,lname:%s \n",row.getInt("user_id"),row.getString("fname"), row.getString("lname"));
		}
    	close();
    }
    
    
    private  static void init(){
    	if(cluster == null){
    		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    		session = cluster.connect("mykeyspace");
    	}
    }
    
    private static void close(){
    	if(cluster != null){
    		cluster.close();
    	}
    }
    
    
    
}
