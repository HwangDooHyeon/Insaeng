package manager;

import object.User;

public class GameManager {
    private static GameManager instance = null;

    public static GameManager getInstance(){
        if(instance == null)
            instance = new GameManager();
        return instance;
    }

    public final int 매뉴 = 0;
    public final int 로고 = 6;

    private User user = null;

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public void initialize(){
        user = new User();
    }
}
