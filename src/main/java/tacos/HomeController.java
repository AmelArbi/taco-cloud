package tacos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
//    The controller
//    Handles requests for the root path /
//    Returns the view name
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
