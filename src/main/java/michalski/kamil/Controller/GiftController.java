package michalski.kamil.Controller;

import michalski.kamil.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GiftController {
    @GetMapping("/")
    public String listGifts(){
        return "home";
    }

    @GetMapping("/gif")
    public String gitDetails(ModelMap modelMap){
        Gif gif = new Gif("android-explosion","Kamil",true);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
