package hiber.loader;

import javax.annotation.PostConstruct;

import hiber.model.User;
import hiber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    private final UserService userService;

    @Autowired
    public DataLoader(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void dataInit() {

        User user1 = new User();
        user1.setFirstName("Peter");
        user1.setLastName("Parker");
        user1.setEmail("pparker@gmail.com");

        User user2 = new User();
        user2.setFirstName("Sarah");
        user2.setLastName("Connor");
        user2.setEmail("ddayconnor@gmail.com");

        User user3 = new User();
        user3.setFirstName("John");
        user3.setLastName("Wick");
        user3.setEmail("killthemall@gmail.com");

        User user4 = new User();
        user4.setFirstName("Mary");
        user4.setLastName("Jane");
        user4.setEmail("mjwatson@gmail.com");

    }
}
