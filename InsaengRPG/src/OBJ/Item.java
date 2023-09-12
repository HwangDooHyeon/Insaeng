package OBJ;

import Main.ObjectManager;

public class Item extends Object {
    public void initialize(){}
    public void update(){}
    public void render(){}

    protected int goomonBook, ssenBook, majorBook;
    protected int silver, gold, diamond;
    protected int artMuseum_1, artMuseum_2, artMuseum_3;
    protected int eclipse, pureMilkyMacaroon, makGookSu;

    public void goomonBook() { this.Intel = 3; }

    public void ssenBook() { this.Intel = 5; }

    public void majorBook() { this.Intel = 7; }

    public void silver() { this.Sociability = 3; }

    public void gold() { this.Sociability = 5; }

    public void diamond() { this.Sociability = 7; }

    public void artMuseum_1() { this.Artistry = 3; }

    public void artMuseum_2() { this.Artistry = 5; }

    public void artMuseum_3() { this.Artistry = 7; }

    public void eclipse() { this.PTSD = -3; }

    public void pureMilkyMacaroon() { this.PTSD = -5; }

    public void makGookSu() { this.PTSD = -7; }

}
