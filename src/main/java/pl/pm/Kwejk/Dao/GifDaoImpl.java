package pl.pm.Kwejk.Dao;

import org.springframework.stereotype.Component;
import pl.pm.Kwejk.Model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GifDaoImpl implements GifDao {

static List<Gif> gifs = new ArrayList<>();
static{
    gifs.add(new Gif("android-explosion", "ktp"));
    gifs.add(new Gif("ben-and-mike","pwl"));
    gifs.add(new Gif("book-dominos","kml"));
    gifs.add(new Gif("compiler-bot","gif"));
    gifs.add(new Gif("cowboy-coder","adi"));
    gifs.add(new Gif("infinite-andrew","qwe"));
}

    @Override
    public List<Gif> findAll() {
    return gifs;
    }

    @Override
    public List<Gif> findbyName(String name) {
        return gifs.stream().filter((p)->p.getName().equals(name)).collect(Collectors.toList());
    }

}
