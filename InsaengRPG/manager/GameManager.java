package manager;

import object.User;

public class GameManager {
    private static GameManager instance = null;

    public static GameManager getInstance(){
        if(instance == null)
            instance = new GameManager();
        return instance;
    }

    public final int 로고 = 0;
    public final int 매뉴 = 1;
    public final int 교육 = 2;
    public final int 알바 = 3;
    public final int 파티 = 4;
    public final int 외출 = 5;
    public final int 상태 = 6;

    private User user = null;

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public void initialize(){
        user = new User();
    }
}
