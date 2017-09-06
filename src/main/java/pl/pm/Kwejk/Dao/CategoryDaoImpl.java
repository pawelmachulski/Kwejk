package pl.pm.Kwejk.Dao;

import org.springframework.stereotype.Component;
import pl.pm.Kwejk.Model.Category;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDaoImpl implements CategoryDao{
    static List<Category> categories = new ArrayList<>();

    static{
        categories.add(new Category(1, "śmieszne"));
        categories.add(new Category(2, "czarny humor"));
        categories.add(new Category(3, "nieśmieszne"));
    }

    @Override
    public List<Category> findAllCat() {
        return categories;
    }

}
