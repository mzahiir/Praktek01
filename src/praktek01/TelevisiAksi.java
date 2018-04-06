/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author proWindows 10
 */
public class TelevisiAksi {
    public static void main(String[] args) {
        Televisi Samsung = new Televisi();
        
        Samsung.Jenis="Samsung 564GHJ";
        Samsung.HD="Ya";
        Samsung.Resulution="1080P";
        Samsung.Ukuran="Besar";
        Samsung.Warna="Hitam";
        
        Samsung.cetakInfo();
    }
}
