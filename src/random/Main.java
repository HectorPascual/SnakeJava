/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;

/**
 
 * @author hector
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v1 = new Ventana("hola");
        
        ArrayList<Rectangulo> serp = new ArrayList<>();
        ArrayList<Double> px = new ArrayList<>(); 
        ArrayList<Double> py = new ArrayList<>();
        boolean[] mov = {false,false,false,false};
        
        Comida c1 = new Comida();
        int i = 0;
        int c = 0;
        int x = 0;
        serp.add(new Rectangulo(0,0));
        while(!v1.isPulsadoEspacio()){
            v1.escribeTexto("Press space to play", -5, 0, 1, Color.yellow);
            v1.actualizaFotograma();
        }
        v1.cerrar();
        
        Ventana v = new Ventana("hola");

        while(!v.isPulsadoEscape()){
           // serp.add(new rectangulo(i,i));
            
            px.add(c, serp.get(0).getPosx());
            py.add(c, serp.get(0).getPosy());
            v.setSuavizado(true);
            x = 0;
            for(Rectangulo r: serp){
                r.setPosx(px.get(c-2*x));
                r.setPosy(py.get(c-2*x));
                x++;
                
            }
            serp.get(0).move(v,mov);

            for(Rectangulo r : serp)
                r.draw(Color.yellow, v);
                
            c1.draw(Color.red, v);
            if(c1.haColisionado(serp.get(0))){
                serp.add(new Rectangulo(serp.get(0).getPosx(),serp.get(0).getPosy()));
                i++;
            }
            v.actualizaFotograma();
            //i+=1;
            c++;
        }
        v.cerrar();
        
    }
    
}
