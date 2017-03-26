/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author hector
 */
public class Comida {
    
    private static final double ancho = 0.5;
    private static final double alto = 0.5;
    
    private double posx;
    private double posy;
    
    private Random r = new Random();
    
    public Comida(){
        
        posx = r.nextDouble()*13.25;
        posy = r.nextDouble()*10;
        
    }
    
    public void draw(Color color, Ventana v){
        v.dibujaRectangulo(posx, posy, ancho, alto, color);
    }
    
    public boolean haColisionado(Rectangulo r){
        
        if((Math.abs((r.getPosx() - posx)) <=  0.5 )&&(Math.abs((r.getPosy() - posy)) <= 0.5)){
            System.out.println("HA TOCADO");
            cambiarPos();
            return true;

        }
  
        return false;
        
    }
    
    public void cambiarPos(){
       if(r.nextInt(1) == 1){
        posx = r.nextDouble()*13.25;
        posy = r.nextDouble()*10;
       }
       else{
        posx = r.nextDouble()*-13.25;
        posy = r.nextDouble()*-10;
       }
    }
    
}
