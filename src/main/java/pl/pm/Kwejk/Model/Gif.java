package pl.pm.Kwejk.Model;
import org.springframework.stereotype.Component;

@Component
public class Gif {

    private String name;
    private String username;
    private boolean like;


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
        return name + " " + username;
    }
}
