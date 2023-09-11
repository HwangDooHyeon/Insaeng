package RDItem;

import Main.User;

public class ObjectManager {

    private static ObjectManager instance = null;

    public static ObjectManager getInstance()
    {
        if(instance == null)
            instance = new ObjectManager();

        return instance;
    }

    Object user = null;

    public void initialize(){
        this.user = new User();
    }

    public Object getUser() { return user;}
    public void setUser(Object user) { this.user = user;}

}