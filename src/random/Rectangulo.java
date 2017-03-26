/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.awt.Color;

/**
 *
 * @author hector
 */
public class Rectangulo {
    
    private final static double ancho = 0.5;

    public double getPosx() {
        return posx;
    }

    public double getPosy() {
        return posy;
    }
    private final static double alto = 0.5;
    private final static double velocidad =0.25; 
    
    
    private double posx;
    private double posy;
    
    public Rectangulo(double posx, double posy){
        this.posx = posx;
        this.posy = posy;
    }
    
    public void draw(Color color, Ventana v){
        v.dibujaRectangulo(posx, posy, ancho, alto, color);
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }
    
    public void move(Ventana v, boolean[] mov){
        if(v.isPulsadoArriba() || mov[0] == true){
            //posy+=velocidad;
            mov[0] = true;
            mov[1] = false;
            mov[2] = false;
            mov[3] = false;
        }
        if(v.isPulsadoAbajo() || mov[1] == true){
            //posy-=velocidad;
            mov[0] = false;
            mov[1] = true;
            mov[2] = false;
            mov[3] = false;
        }
        if(v.isPulsadoDerecha() || mov[2] == true){
            //posx+=velocidad;
            mov[0] = false;
            mov[1] = false;
            mov[2] = true;
            mov[3] = false;
        }
        if(v.isPulsadoIzquierda() || mov[3] == true){
           // posx-=velocidad;
            mov[0] = false;
            mov[1] = false;
            mov[2] = false;
            mov[3] = true;
        }
        
        if(mov[0]) posy+=velocidad;
        if(mov[1]) posy-=velocidad;
        if(mov[2]) posx+=velocidad;
        if(mov[3]) posx-=velocidad;
        
        if(posy >= 10){
            posy = 10;
        }
        if(posy <= -9.5){
            posy = -9.5;
        }
        if(posx >= 12.75){
            posx = 12.75;
        }
        if(posx <= -13.25){
            posx = -13.25;
        }
    }
  
    
}
