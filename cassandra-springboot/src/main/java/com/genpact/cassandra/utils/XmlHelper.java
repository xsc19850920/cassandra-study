package com.genpact.cassandra.utils;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.genpact.cassandra.pojo.Users;

public class XmlHelper {
	
	public static List<Users> readXML(String elementpath) throws ParserConfigurationException, SAXException, IOException {
		List<Users> userList = new LinkedList<Users>();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(new File("src/main/resources/ask_ubuntu_users.xml"));
		NodeList list = document.getElementsByTagName(elementpath);
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
			userList.add(user);
		}
		return userList;
	}

//	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//		readXML("row");
//	}
}
