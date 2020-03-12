
package hn.paisallison.uth.hn;

public class Linea extends Formas {
    private int largo;

    public Linea(String color,int largo) {
        this.color= color;
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
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
        System.out.println("Linea");
    }
    
    
}
