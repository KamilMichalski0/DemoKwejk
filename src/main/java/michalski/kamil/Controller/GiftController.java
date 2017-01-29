package michalski.kamil.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GiftController {
    @GetMapping("/")
    public String listGifts(){
        return "home";
    }
}
