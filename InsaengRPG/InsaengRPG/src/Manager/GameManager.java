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

    User user = new User();

    public void initialize(){}

    public User getUser() { return user;}
    public void setUser(User user) { this.user = user;}

}