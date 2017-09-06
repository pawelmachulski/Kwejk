package pl.pm.Kwejk.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pm.Kwejk.Dao.CategoryDao;
import pl.pm.Kwejk.Model.Category;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiCategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping("/categories")
    public List<Category> getCategories(){
        return categoryDao.findAllCat();
    }
    }
