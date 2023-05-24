package tecnicas.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        return "index";
    }

    @RequestMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }
    
    @RequestMapping("/user")
    public String showUserPage() {
        return "user";
    }

}