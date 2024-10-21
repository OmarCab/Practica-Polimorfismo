package graphics;

import java.awt.Color;
import java.awt.Graphics;

/*
 Esta clase representa el primero de lo que, con un poco de suerte,
 será un bien estructurado proyecto polimórfico. Observa su estructura
 y utilizalo como guía para las demás clases.

 Martín Omar Cab Chi

*/

public class Cuadrado extends FiguraGrafica {
    
    protected int x;
    protected int y;
    protected int lado;

    public Cuadrado (int x, int y, int lado) {
        this.x = x;
        this.y = y;
        this.lado = lado;
    }
    
    @Override
    public void dibujar(Graphics g){
        g.fillRect(x, y, lado, lado);
    }
    
    @Override
    public void encojer(Graphics g) {
        lado -= 5;
        if (lado < 5) lado = 5;
        this.dibujar(g);        
    }
    
    @Override
    public void agrandar(Graphics g) {
        lado += 5;
        if (lado > 200) lado = 200;
        this.dibujar(g);
    }
    
    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }
    
    @Override
    public void mover(Graphics g, String direccion){
        switch(direccion){
            case "arriba"    : y-=5; break;
            case "abajo"     : y+=5; break;
            case "izquierda" : x-=5; break;
            case "derecha"   : x+=5; break;
        }
        this.dibujar(g);
    }    
}
