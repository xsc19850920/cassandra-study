package com.genpact.cassandra.service;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.genpact.cassandra.dao.UsersRepository;
import com.genpact.cassandra.pojo.Users;

@Service
public class UserService {

	@Autowired
	private UsersRepository userDao;
	
	public Iterable<Users> findAll(){
		return userDao.findAll();
	}
	
	
	public  void readXML() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(new File("src/main/resources/ask_ubuntu_users.xml"));
		NodeList list = document.getElementsByTagName("row");
		Users user ;
		for (int i = 0; i < list.getLength(); i++) {
			Element element = (Element) list.item(i);
			user = new Users(new Long(element.getAttribute("Id")),
							new Integer(element.getAttribute("Reputation")), 
							element.getAttribute("CreationDate"),
							element.getAttribute("DisplayName"),
							element.getAttribute("EmailHash"),
							element.getAttribute("LastAccessDate"),
							new Integer(element.getAttribute("Views")),
							new Integer(element.getAttribute("UpVotes")),
							new Integer(element.getAttribute("DownVotes")));
			userDao.save(user);
		}
	}
	
	
}
