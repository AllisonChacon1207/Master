/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.paisallison.uth.hn;
 
public class Triangulo extends Formas{
    private int angulo;

    public Triangulo(String color,int angulo) {
        this.angulo = angulo;
        this.color = color;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void dibujar() {
        super.dibujar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Triangulo");
    }
    
    public void calcularArea(){
        System.out.println("calculando area");
    }
    
}
