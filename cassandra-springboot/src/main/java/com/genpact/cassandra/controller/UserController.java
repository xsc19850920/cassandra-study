package com.genpact.cassandra.controller;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xml.sax.SAXException;

import com.genpact.cassandra.config.CassandraConfiguration;
import com.genpact.cassandra.pojo.Users;
import com.genpact.cassandra.service.UserService;

@SpringBootApplication
public class UserController {
	@Autowired
	private  UserService userService;
	
    public static void main(String[] args) {
    	
    	SpringApplication.run(CassandraConfiguration.class, args);
    }
   
    
    @RequestMapping("/view")
	@ResponseBody
	String view() {
    	Iterable<Users> list = userService.findAll();
    	StringBuilder sb = new StringBuilder();
    	for (Users u : list) {
			sb.append(u.toString()+"\r\t");
		}
		return sb.toString();
	}
    
//    @RequestMapping("/init")
//	@ResponseBody
//    void  init() throws ParserConfigurationException, SAXException, IOException{
//    	userService.readXML();
//    }
}
