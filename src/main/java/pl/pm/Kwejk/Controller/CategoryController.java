package pl.pm.Kwejk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pm.Kwejk.Dao.CategoryDao;
import pl.pm.Kwejk.Dao.GifDao;

import javax.swing.*;

@Controller
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private GifDao gifDao;


    @GetMapping("/categories")
    public String category(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryDao.findAllCat());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String show(@PathVariable int id,ModelMap modelMap){
        modelMap.addAttribute("category",categoryDao.findCatById(id));
        modelMap.addAttribute("gifs",gifDao.findByCategoryId(id));
        return "category";
    }
}
