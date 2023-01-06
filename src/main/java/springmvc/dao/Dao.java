package springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;
@Repository
public class Dao {
	@Autowired
   private  HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveuser(User user) {
		int id=(Integer) hibernateTemplate.save(user);
		return id;
	}
	

}
