package pl.pm.Kwejk.Dao;

import pl.pm.Kwejk.Model.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> findAllCat();
    List<Category> findCatById(int name);
    List<Category> findCatByName(String name);
}
