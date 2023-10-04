package Controller;

import User.User;

public class GameController {
    private static GameController instance = null;

    public static GameController getInstance()
    {
        if(instance == null)
            instance = new GameController();

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