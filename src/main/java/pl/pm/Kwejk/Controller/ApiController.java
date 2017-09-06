package pl.pm.Kwejk.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.pm.Kwejk.Dao.CategoryDao;
import pl.pm.Kwejk.Dao.GifDao;
import pl.pm.Kwejk.Model.Category;
import pl.pm.Kwejk.Model.Gif;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping("/categories")
    public List<Category> getCategories(){
        return categoryDao.findAllCat();
    }
    }
