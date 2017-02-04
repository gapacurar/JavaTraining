/*
 * Clasa patrat care va fi dezvoltata utilizand metoda TDD
 */
package learningtesting;

/**
 * Clasa patrat dezvoltata TDD
 * @author gheorgheaurelpacurar
 */
public class Patrat {
    
    private int latura = 0;

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }
    
    public int getSurface(){
        return latura*latura;
    }
    
    
    
}
