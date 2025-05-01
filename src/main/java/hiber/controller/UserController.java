package src.main.java.hiber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String printUsers(ModelMap model) {
        List<User> users = userService.printUsers();
        model.addAttribute("users", users);
        model.addAttribute("message", "Список пользователей");
        return "users";

    }


}
