package michalski.kamil.Controller;

import michalski.kamil.model.Gif;
import michalski.kamil.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GiftController {

    @Autowired
    private GifRepository gifRepository;


    @GetMapping("/")
    public String listGifts(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.getAllGifs());
        return "home";
    }

    @GetMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = gifRepository.findByName("android-explosion");
        modelMap.put("gif", gif);
        return "gif-details";
    }

    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.getFavorites());
        return "favorites";
    }

    @GetMapping("/gif/{name}")
    public String gifDetalis(@PathVariable String name, ModelMap modelMap) {
        modelMap.put("gif", gifRepository.findByName(name));
        return "gif-details";
    }
}
