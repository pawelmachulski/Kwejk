package pl.pm.Kwejk.Dao;

import pl.pm.Kwejk.Model.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    List<Gif> findbyName(String name);

}
