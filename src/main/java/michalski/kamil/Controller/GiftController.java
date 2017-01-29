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
    private GiftRepository gifRepository;


    @GetMapping("/")
    public String listGifts(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifRepository.getAllGifs());
        return "home";
    }

    @GetMapping("/gif")
    public String gitDetails(ModelMap modelMap){
        Gif gif = gifRepository.findByName("android-explosion");
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
