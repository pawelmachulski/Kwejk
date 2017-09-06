package pl.pm.Kwejk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pm.Kwejk.Dao.CategoryDao;

@Controller
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/categories")
    public String category(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryDao.findAllCat());
        return "categories";
    }

}
