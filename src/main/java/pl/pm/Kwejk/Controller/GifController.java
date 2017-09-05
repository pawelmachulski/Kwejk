package pl.pm.Kwejk.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pm.Kwejk.Dao.GifDao;

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
        modelMap.addAttribute("gif", gifDao.findbyName(name).get(0));
        return "gif-details";
    }

    @GetMapping("/results")
    public String search(@RequestParam String q, ModelMap modelMap){
        modelMap.addAttribute("gifss",gifDao.findbyName(q));
        return "home";
    }
    @GetMapping("/categories")
    public String category(ModelMap modelMap){
        modelMap.addAttribute("categories",gifDao.findAllCat());
        return "categories";
    }


}