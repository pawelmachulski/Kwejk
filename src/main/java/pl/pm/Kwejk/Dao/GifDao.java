package pl.pm.Kwejk.Dao;

import pl.pm.Kwejk.Model.Category;
import pl.pm.Kwejk.Model.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    List<Gif> findbyName(String name);
    List<Gif> isLike(boolean like);
}
