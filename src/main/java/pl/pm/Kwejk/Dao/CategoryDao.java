package pl.pm.Kwejk.Dao;

import pl.pm.Kwejk.Model.Category;

import javax.swing.*;
import java.util.List;

public interface CategoryDao {

    List<Category> findAllCat();
    List<Category> findCatById(int name);
}
