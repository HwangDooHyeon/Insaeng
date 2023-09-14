package Object;

import Scene.Scene;

public class User {

    final int MAX = 100;
    final int MIN = 30;

    int Intel = MIN;
    int Wealth = MIN;
    int Sociability = MIN;
    int Morality = MIN;
    int Artistry = MIN;
    int PTSD = MIN;

    public User() {}
    public User(int Intel, int Wealth, int Sociability, int Morality, int Artistry, int PTSD) {
        this.Intel = Intel;
        this.Wealth = Wealth;
        this.Sociability = Sociability;
        this.Morality = Morality;
        this.Artistry = Artistry;
        this.PTSD = PTSD;
    }

    public int getIntel() { return Intel; }
    public void setIntel(int intel) { this.Intel = intel; }

    public int getWealth() { return Wealth; }
    public void setWealth(int wealth) { this.Wealth = wealth; }

    public int getSociability() { return Sociability; }
    public void setSociability(int sociability) { this.Sociability = sociability; }

    public int getMorality() { return Morality; }
    public void setMorality(int morality) { this.Morality = morality; }

    public int getArtistry() { return Artistry; }
    public void setArtistry(int artistry) { this.Artistry = artistry; }

    public int getPTSD() { return PTSD; }
    public void setPTSD(int PTSD) { this.PTSD = PTSD; }

}