/*
 * Processing the oprations
 */
package computer;

/**
 * Memorize introduced operands and operators and at the end computes the result
 * @author gheor
 */
public class Processor {
    
    private Double firstOperand;
    private Double secondOperand;
    private Double result;
    private Character operator;

    public Double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(Double primulOperand) {
        this.firstOperand = primulOperand;
    }

    public Double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Double alDoileaOperand) {
        this.secondOperand = alDoileaOperand;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
    /**Method computes +*/
    private Double add(){
        result = firstOperand + secondOperand;
        return result;
    }
    /**Method computes -*/
    private Double substract(){
        result = firstOperand - secondOperand;
        return result;
    }
    /**Method computes * */
    private Double multiply(){
        result = firstOperand * secondOperand;
        return result;
    }
    /**Method computes  / */
    private Double divide(){
        result = firstOperand / secondOperand;
        return result;
    }
    /**Method identifies and execute the computatio
     * @return result of computation*/
    public Double compute(){
        
        switch(operator){
            case'+':
                add();
                break;
            case'-':
                substract();
                break;   
            case'*':
                multiply();
                break;  
            case'/':
                divide();
                break;     
        }
        return result;
    }
}
