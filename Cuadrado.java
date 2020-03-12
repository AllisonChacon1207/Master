
package hn.paisallison.uth.hn;

public class Cuadrado extends Formas{
    private int area;

    public Cuadrado(int area,String color) {
        this.area = area;
        this.color =color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void calcularArea(){
        System.out.println("calculando area");
    }
    
}
