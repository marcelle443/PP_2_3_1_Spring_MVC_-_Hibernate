package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      Car bmw = new Car("BMW", 5);
      Car vw = new Car("Volkswagen Golf", 6);
      Car kia = new Car("Kia Rio", 3);
      Car ford = new Car("Ford Focus", 4);

      User user1 = new User("Peter", "Parker", "peterp@mail.ru", bmw);
      User user2 = new User("Mary", "Jane", "maryj@mail.ru", vw);
      User user3 = new User("Harry", "Osborn", "harryo@mail.ru", kia);
      User user4 = new User("Flash", "Thompson", "flasht@mail.ru", ford);

      userService.add(user1);
      userService.add(user2);
      userService.add(user3);
      userService.add(user4);



      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+ user.getId());
         System.out.println("First Name = "+ user.getFirstName());
         System.out.println("Last Name = "+ user.getLastName());
         System.out.println("Email = "+ user.getEmail());
         System.out.println("Car = "+ user.getUserCar());
      }
      User findUser = userService.getUSerByCar("BMW", 5);
      System.out.println("Получить пользователя по машине: " +
              findUser.getFirstName() + findUser.getLastName());


      context.close();
   }


}
