package Menu;

import Main.ObjectManager;
import OBJ.Object;

public abstract class Scene {

        protected Object user = null;


        public Scene(){ user = ObjectManager.getInstance().getUser();        }


        public abstract void initialize();
        public abstract void update();
        public abstract void render();

        //test

}

