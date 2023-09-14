package scene;

import object.User;

public abstract class Scene {
    User user = null;
    String sceneName;
    int sceneWealth, sceneIntel, scenePTSD, sceneMorality, sceneSociability, sceneArtistry;
    public abstract void initialize();
    public abstract int update();
    public abstract void render();
}
