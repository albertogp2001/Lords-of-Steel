/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author Alberto
 */
public class NanOrdre extends Nan implements Ordre{
    
    public NanOrdre(String nom,int forca,int constitucio, int velocitat,
                    int intelligencia, int sort, Arma arma){
        
        super(nom,forca,constitucio,velocitat,intelligencia,sort,arma);
    }
    
    
//    @Override
//    public void restauraPS() {
//        
//    }

    @Override
    public void restaubluraPS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
