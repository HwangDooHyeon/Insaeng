package Main;

import OBJ.Item;
import OBJ.Object;
import OBJ.User;

public class ObjectManager {

    private static ObjectManager instance = null;

    public static ObjectManager getInstance()
    {
        if(instance == null)
            instance = new ObjectManager();

        return instance;
    }

    Object user = null;
    Object item = null;



    public void setItem(Object item) {
        this.item = item;
    }

    public void initialize(){
        this.user = new User();
        this.item = new Item();
    }

    public Object getUser() { return user;}
    public void setUser(Object user) { this.user = user;}

    public Object getItem() { return item; }
    public void setInstance(Object item) { this.item  = item; }

}