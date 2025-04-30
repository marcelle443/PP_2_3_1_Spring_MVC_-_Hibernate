package hiber.dao;

import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   private final SessionFactory sessionFactory;


   public UserDaoImp(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
   }




   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

   @Override
   public User getUserByCar(String model, int series) {
      Session session = sessionFactory.openSession();
      String hql = "FROM User u WHERE u.car.model = :model AND u.car.series = :series";
      List<User> users = session.createQuery(hql, User.class)
              .setParameter("model", model)
              .setParameter("series", series)
              .getResultList();
      session.close();
      return users.isEmpty() ? null : users.get(0);

   }

}
