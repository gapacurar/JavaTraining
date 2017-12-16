/*
 * Man
 */
package family;

/**
 *
 * @author gheor
 */
public class Man extends Thread{
    private VacuumCleaner vc;
    private Woman w;
    private Tv tv;
    
    public Man(VacuumCleaner v, Woman woman, Tv televizor){
        vc = v;
        w = woman;
        tv = televizor;
    }
    
    @Override
    public void run(){
        cleaning(vc);
        watchingTv(tv,w);
    }
    
    private void cleaning(VacuumCleaner vc){
        vc.setIsCeaning(Boolean.TRUE);
        
    }
    
    private void watchingTv(Tv tv, Woman w){
        while(true){
            if(tv.getIsFavoriteShow() == true){
               w.setIsSleeping(Boolean.FALSE);
               break;
            }
        }
    }
}
