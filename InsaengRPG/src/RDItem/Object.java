package RDItem;

public abstract class Object {
    protected String name;

    protected int Intel, Wealth, Sociability, Morality, Artistry, PTSD;

    public Object(){}

    public Object(String name, int Intel, int Wealth, int Sociability, int Morality, int Artistry, int PTSD) {
        this.PTSD=MIN;
        this.Intel = MIN;
        this.Wealth = MIN;
        this.Sociability=MIN;
        this.Morality=MIN;
        this.Artistry=MIN;
    }
    final int MAX = 100;
    final int MIN = 0;


    public String getName() { return name; }
    public void setName(String name) {  this.name = name; }

    public int getIntel() { return Intel; }
    public void setIntel(int intel) { Intel = intel; }

    public int getWealth() { return Wealth; }
    public void setWealth(int wealth) { Wealth = wealth; }

    public int getSociability() { return Sociability; }
    public void setSociability(int sociability) { Sociability = sociability; }

    public int getMorality() { return Morality; }
    public void setMorality(int morality) { Morality = morality; }

    public int getArtistry() { return Artistry; }
    public void setArtistry(int artistry) { Artistry = artistry; }

    public int getPTSD() { return PTSD; }
    public void setPTSD(int PTSD) { this.PTSD = PTSD; }


}