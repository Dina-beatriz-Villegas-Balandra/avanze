/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author EPIS
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    float suma(float a, float b){
    return a + b;
    }
      
    float restar (float a, float b){
        return a - b; 
    }
    
    float multiplicacion (float a , float b){
    return a * b;
}
float division (float a , float b){
return a / b;
}
float potencia (double a , double b){
return (float) Math.pow(a, b) ;

}
}
