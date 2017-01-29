package michalski.kamil.Controller;

import michalski.kamil.model.Gif;
import michalski.kamil.repository.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GiftController {

    @Autowired
    private GiftRepository giftRepository;


    @GetMapping("/")
    public String listGifts(){
        return "home";
    }

    @GetMapping("/gif")
    public String gitDetails(ModelMap modelMap){
        Gif gif = giftRepository.findByName("android-explosion");
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
