package pl.pm.Kwejk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pm.Kwejk.Dao.GifDao;
import pl.pm.Kwejk.Model.Gif;

@Controller
public class GifController {

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("gifs",gifDao.findAll());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap){
        System.out.println("Duapa"+gifDao.findbyName(name));
        modelMap.addAttribute("gif", gifDao.findbyName(name).get(0));
        return "gif-details";
    }

}