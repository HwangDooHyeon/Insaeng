package Manager;

import Object.User;

public class GameManager {

    private static GameManager instance = null;

    public static GameManager getInstance()
    {
        if(instance == null)
            instance = new GameManager();

        return instance;
    }

    User user = null;
    public final int menu = 0;
    public final int intro = 6;

    public void initialize(){
        this.user = new User();
    }

    public User getUser() { return user;}
    public void setUser(User user) { this.user = user;}

}