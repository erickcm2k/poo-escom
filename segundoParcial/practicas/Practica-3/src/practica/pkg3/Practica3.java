/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;
import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivere vivere1 = new Vivere(1000, "Galletas", 1, 2020);
        System.out.println(vivere1.getID());
        ArrayList<Vivere> viveres = new ArrayList<Vivere>();
        viveres.add(vivere1);
        viveres.add(new Vivere(2000, "Palomitas", 2, 2021));
        
        for(int i = 0; i < viveres.size(); i++) {
            System.out.println(viveres.get(i).getmarca());
        }
        
    }
    
}
