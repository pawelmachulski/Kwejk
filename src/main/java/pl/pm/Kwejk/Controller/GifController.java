package pl.pm.Kwejk.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pm.Kwejk.Dao.CategoryDao;
import pl.pm.Kwejk.Dao.GifDao;

@Controller
public class GifController {

    @Autowired
    private GifDao gifDao;
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("gif", gifDao.findbyName(name).get(0));
        return "gif-details";
    }

    @GetMapping("/favorites")
    public String favorite(ModelMap modelMap) {
        modelMap.addAttribute("gifLike", gifDao.isLike(true));
        return "favorites";
    }


    @GetMapping("/results")
    public String search(@RequestParam String q, ModelMap modelMap) {
        modelMap.addAttribute("gifss", gifDao.findbyName(q));
        modelMap.addAttribute("categories", categoryDao.findCatByName(q));
        if(gifDao.findbyName(q).isEmpty() && categoryDao.findCatByName(q).isEmpty()) {
            modelMap.addAttribute("comment", "Nie znaleziono");
        }
        return "home";
    }

}