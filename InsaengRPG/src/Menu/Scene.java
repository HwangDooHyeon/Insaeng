package Menu;

import Main.ObjectManager;
import OBJ.Item;
import OBJ.Object;

import java.util.Scanner;

public abstract class Scene {
        protected Object user = null;
        protected Item item = null;
        protected String printName;
        protected int money ,social, stress, moral, intel, art;

        protected Scanner scanner = null;
        public Scene()
        {
                printName = "";
                money = 0;
                social = 0;
                stress = 0;
                moral = 0;
                intel = 0;
                art = 0;
                user = ObjectManager.getInstance().getUser();
        }

        public abstract void initialize();
        public abstract void update();
        public abstract void render();

}

