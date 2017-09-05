package pl.pm.Kwejk.Model;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.springframework.stereotype.Component;
import pl.pm.Kwejk.Dao.GifDao;

import java.util.ArrayList;
import java.util.List;

@Component
public class Gif {

    private String name;
    private String username;
    private Boolean like;

    public Gif(String name, String username, Boolean like) {
        this.name = name;
        this.username = username;
        this.like = like;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Gif(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Gif(){};

    public String getUrl(){
        return "/gifs/"+getName()+".gif";
    }

    @Override
    public String toString() {
        return name + " " + username+" "+like;
    }



    }

