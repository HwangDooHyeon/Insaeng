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
    Item item = null;

    public void initialize(){
        this.user = new User();
        this.item = new Item();
    }

    public Object getUser() { return user;}
    public void setUser(Object user) { this.user = user;}

    public Item getItem() { return item; }
    public void setInstance(Item item) { this.item  = item; }

}