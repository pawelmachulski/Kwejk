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


    @Override
    public String toString() {
        return "Gif{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}