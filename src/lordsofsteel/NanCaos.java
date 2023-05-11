/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author Alberto
 */
public class NanCaos extends Nan implements Caos {
    
    public NanCaos(String nom,int forca,int constitucio, int velocitat,
                    int intelligencia, int sort, Arma arma){
        
        super(nom,forca,constitucio,velocitat,intelligencia,sort,arma);
    }
    
    /*
    public boolean atacPAReduida(Dau ... d){
        return true;
    }
    */

    @Override
    public void atacPAReduida(Dau... d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
