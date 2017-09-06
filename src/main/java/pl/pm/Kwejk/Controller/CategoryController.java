package pl.pm.Kwejk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pm.Kwejk.Dao.CategoryDao;

public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;


    @GetMapping("/categories")
    public String category(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryDao.findAllCat());
        return "categories";
    }
}
