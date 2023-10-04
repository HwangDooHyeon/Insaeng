package Controller;

import DAO.SceneDAOImplement;
import DTO.UserDTO;
import User.User;
import java.util.Scanner;

public abstract class Scene {
        //protected User user = null;
        //protected UserDTO userDTO = null;
        protected int sceneIntel, sceneWealth, sceneSociability, sceneMorality, sceneArtistry, scenePTSD;
        protected String sceneName;
        //protected SceneDAOImplement sceneDAOImplement = null;
        protected Scanner scanner = null;
        public Scene()
        {
                sceneName = "";
                sceneWealth = 0;
                sceneSociability = 0;
                scenePTSD = 0;
                sceneMorality = 0;
                sceneIntel = 0;
                sceneArtistry = 0;
                //user = GameController.getInstance().getUser();
                //sceneDAOImplement = new SceneDAOImplement();
                //userDTO = new UserDTO();
        }

        public abstract void initialize();
        public abstract int update();
        public abstract void render();

}

