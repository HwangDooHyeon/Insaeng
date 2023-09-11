package Main;

public class ObjManeger {
    private static ObjManeger instance = null;

    private static ObjManeger getInstance(){
        if(instance == null)
            instance = new ObjManeger();

        return instance;
    }


}
