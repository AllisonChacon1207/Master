package hn.paisallison.uth.hn;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo("verde", 21);
        Linea linea =new Linea("azul", 22);
        Triangulo triangulo = new Triangulo("Rojo", 25);
        Cuadrado cuadrado = new Cuadrado(10, "gris");
        
        System.out.println(circulo.getColor());
        System.out.println(circulo.getRadio());
        circulo.calcularRadio();
        circulo.dibujar();
        System.out.println("--------------------");
        System.out.println(linea.getColor());
        System.out.println(linea.getLargo());
        linea.dibujar();
        System.out.println("--------------------");
        System.out.println(triangulo.getColor());
        System.out.println(triangulo.getAngulo());
        triangulo.calcularArea();
        triangulo.dibujar();       
        System.out.println("--------------------");
        System.out.println(cuadrado.getColor());
        System.out.println(cuadrado.getArea());
        cuadrado.calcularArea();
        cuadrado.dibujar();    
        
    
    }

}
