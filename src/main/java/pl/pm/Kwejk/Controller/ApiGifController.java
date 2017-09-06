package pl.pm.Kwejk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pm.Kwejk.Dao.GifDao;
import pl.pm.Kwejk.Model.Gif;

import java.util.List;

    @RestController
    @RequestMapping("/api")
    public class ApiGifController {

        @Autowired
        private GifDao gifDao;

        @RequestMapping("/gifs/{name}")
        public List<Gif> getGifs(@PathVariable String name){
            return gifDao.findbyName(name);
        }
    }

