package com.genpact.cassandra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.cassandra.dao.UsersRepository;
import com.genpact.cassandra.pojo.Users;

@Service
public class UserService {

	@Autowired
	private UsersRepository userDao;

	public void selectCount() {
		System.out
				.println("---------------selectCount start-------------------------");
		System.out.println(userDao.count());
		System.out
				.println("---------------selectCount end-------------------------");
	}

	public void insert() {
		System.out
				.println("---------------insert start-------------------------");
		Users user = new Users(1000, "xsc", "love you");
		userDao.save(user);
		System.out
				.println("---------------insert end-------------------------");
	}

	public void update() {
		System.out
				.println("---------------update start-------------------------");
		Users user = userDao.findOne(1000);
		user.setFname("you");
		userDao.save(user);
		System.out
				.println("---------------update end-------------------------");
	}

	public void delete() {
		System.out
				.println("---------------update start-------------------------");
		userDao.delete(1000);
		System.out
				.println("---------------update end-------------------------");
	}

	public void selectByParam() {
		System.out.println("---------------selectByParam start-------------------------");
		List<Users> list = userDao.findByLname("smith");
		for (Users u : list) {
			System.out.println(u.toString());
		}
		System.out.println("---------------selectByParam end-------------------------");
	}
}
