package object;

public class User {

    int Wealth, Intel, PTSD, Morality, Sociability, Artistry;

    public User() {}

    public User(int wealth, int intel, int PTSD, int morality, int sociability, int artistry) {
        this.Wealth = MIN;
        this.Intel = MIN;
        this.PTSD = MIN;
        this.Morality = MIN;
        this.Sociability = MIN;
        this.Artistry = MIN;
    }

    final int MAX = 100;
    final int MIN = 0;

    // 돈
    public int getWealth() { return Wealth; }
    public void setWealth(int wealth) { this.Wealth = wealth; }

    // 지성
    public int getIntel() { return Intel; }
    public void setIntel(int intel) { this.Intel = intel; }

    // 스트레스
    public int getPTSD() { return PTSD; }
    public void setPTSD(int PTSD) { this.PTSD = PTSD; }

    // 도덕성
    public int getMorality() { return Morality; }
    public void setMorality(int morality) { this.Morality = morality; }

    // 사교성
    public int getSociability() { return Sociability; }
    public void setSociability(int sociability) { this.Sociability = sociability; }

    // 예술성
    public int getArtistry() { return Artistry; }
    public void setArtistry(int artistry) { this.Artistry = artistry; }

    public void initialize(){}

    public void render(){
        // 상태확인
        System.out.println("돈 : ");
        System.out.println("지성 : ");
        System.out.println("스트레스 : ");
        System.out.println("도덕성 : ");
        System.out.println("사교성 : ");
        System.out.println("예술성 : ");
        System.out.println("랜덤수치 : ");
    }
}
