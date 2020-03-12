
package hn.paisallison.uth.hn;

public class  Circulo extends Formas {
    private int radio;
    
    public Circulo(String color,int radio) {
        this.color= color;
        this.radio= radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void establecerColor() {
        super.establecerColor(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Rojo");
    }

    @Override
    public void dibujar() {
        super.dibujar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Circulo");
    }
    
    
    public void calcularRadio(){
        System.out.println("calculando radio");
    }
    
    
}
