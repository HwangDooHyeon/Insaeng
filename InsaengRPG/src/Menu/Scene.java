package Menu;

public abstract class Scene {

<<<<<<< Updated upstream
        public Scene(){  }
=======
        protected Object user = null;

        public Scene(){ user = ObjectManager.getInstance().getUser();        }
>>>>>>> Stashed changes

        public abstract void initialize();
        public abstract void update();
        public abstract void render();

        //test

}

