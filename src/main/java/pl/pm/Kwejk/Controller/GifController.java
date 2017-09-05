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
    }/* metoda modelMap dodaje atrybuty do serwera ,które zaciąga z interfejsu
    gifDao a dokłądnie z metody zawartej w tym interfejsie gifdao.findAll*/

    @GetMapping("/gif/{name}")
    public String details(@PathVariable String name, ModelMap modelMap){
        modelMap.addAttribute("gif", gifDao.findbyName(name).get(0));
        return "gif-details";
    }   //details i home - to metody kontrolera
@GetMapping("/favorites")
    public String favorite(ModelMap modelMap){
        modelMap.addAttribute("gifLike",gifDao.isLike(true));
        return "favorites";
}
}