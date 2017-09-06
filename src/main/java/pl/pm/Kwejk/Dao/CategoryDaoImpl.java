package pl.pm.Kwejk.Dao;

import org.springframework.stereotype.Component;
import pl.pm.Kwejk.Model.Category;
import pl.pm.Kwejk.Model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Category> findCatById(int id) {
        return categories.stream().filter((d -> d.getCatId() == id)).collect(Collectors.toList());
    }

    public static List<Category> getCategories() {
        return categories;
    }
}

