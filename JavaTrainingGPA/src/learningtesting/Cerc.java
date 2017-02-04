/*
 * Clasa cerc
 */
package learningtesting;

/**
 * clasa cerc implementeaza o clasa care returneaza definitia cercului
 * @author gheorgheaurelpacurar
 */
public class Cerc {
    
    private String definitie = "Figura geometrica plana definita ca si loc geometric al tututor punctelor egal departate de un punct fix numit centrul cercului la distanta numita raza";
    private int razaCercului = 0;

    public int getRazaCercului() {
        return razaCercului;
    }

    public void setRazaCercului(int razaCercului) {
        this.razaCercului = razaCercului;
    }
    
    public String getDefinitie() {
        return definitie;
    }

    public void setDefinitie(String definitie) {
        this.definitie = definitie;
    }
    
}
