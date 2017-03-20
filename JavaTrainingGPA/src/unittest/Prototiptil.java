/*
 * Class Prototiptil is tiptiling a set of two values
 */
package unittest;

/**
 * 
 * @author gheorgheaurelpacurar
 */
public class Prototiptil {
    
    private int proto = 10;
    private String tiptilos = "Initial String";
    
        public int getProto() {
        return proto;
    }

    public void setProto(int proto) {
        this.proto = proto;
    }

    public String getTiptilos() {
        return tiptilos;
    }

    public void setTiptilos(String tiptilos) {
        this.tiptilos = tiptilos;
    }
    
    String getPrototiptilos(){
        Integer protoInteger = proto;
        String protoString = protoInteger.toString();
        return(protoString+tiptilos);
    }
    
}
