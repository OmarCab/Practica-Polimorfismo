package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 Esta clase representa una (muy mala) implementación de una figura
 geométrica. Tu misión es aplicar con éxito los principios del Polimorfismo
 que aprendiste anteriormente. ¡Suerte!

 Martín Omar Cab Chi
*/

public abstract class FiguraGrafica {  // Cambiar a abstract

    protected String figura;

    public FiguraGrafica() {
        this("cuadrado");
    }

    public FiguraGrafica(String figura) {
        this.figura = figura;
    }

    public abstract void dibujar(Graphics g);  // Declarar como abstracto

    public abstract void encojer(Graphics g);  // Declarar como abstracto

    public abstract void agrandar(Graphics g);  // Declarar como abstracto

    public abstract void cambiarColor(Graphics g, Color c);  // Declarar como abstracto

    public abstract void mover(Graphics g, String direccion);  // Declarar como abstracto
}
