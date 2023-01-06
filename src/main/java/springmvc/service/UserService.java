package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.Dao;
import springmvc.model.User;

@Service
public class UserService {
	@Autowired
	private Dao dao;
	public int createUser(User user)
	{
		return dao.saveuser(user);
	}
}
