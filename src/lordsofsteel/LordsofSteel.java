/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author Alberto
 */
public class LordsofSteel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Arma arma = new Arma("Daga");
        Nan n1 = new Nan(8,6, 13,16,16,new Arma("Daga"));
        
        // Personatge normal: (8+5)/4 = 3
        // Nan: (8+6+5)/4 = 4
        // Nan: ps = (8+6) = 14
        System.out.println("Punts de dany de n1: " + n1.getPd());
        System.out.println("Punts de salut de n1: " + n1.getPs());
    }

}
