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
        Gif gif = new Gif();
        modelMap.addAttribute("gifs",gifDao.findAll());
        modelMap.addAttribute("urls",gif.getUrl());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap){
        modelMap.addAttribute("gifss", gifDao.findbyName(name));
        return "gif-details";
    }

}