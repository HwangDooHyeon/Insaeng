package Main;

public class User {
    // User값을 나타내는 필드
    private int Intel, Wealth, Sociability, Morality, Artistry, PTSD;

    // 생성자
    public User() {}

    public User(int intel, int wealth, int sociability, int morality, int artistry, int PTSD) {
        this.Intel = intel;
        this.Wealth = wealth;
        this.Sociability = sociability;
        this.Morality = morality;
        this.Artistry = artistry;
        this.PTSD = PTSD;
    }

    // 기본값 final로 설정 = MIN=30; / MAX=100;
    final int MAX = 100;
    final int MIN = 30;

    // 현재 반환 메서드 Get / Set
    public int getIntel() {return Intel;}
    public void setIntel(int Intel){this.Intel=Intel;}

    public int getWealth(){return Wealth;}
    public void setWealth(int Wealth){this.Wealth=Wealth;}

    public int getSociability(){return Sociability;}
    public void setSociability(int Sociability){this.Sociability=Sociability;}

    public int getMorality(){return Morality;}
    public void setMorality(int Morality){this.Morality=Morality;}

    public int getArtistry(){return Artistry;}
    public void setArtistry(int Artistry){this.Artistry=Artistry;}

    public int getPTSD(){return PTSD;}
    public void setPTSD(int PTSD){this.PTSD=PTSD;}
}
