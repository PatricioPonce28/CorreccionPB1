package org.example;

public class Cuadrado {
    private int lado;
    private int perimetro_cuadrado;
    private int area_cuadrado;

    public Cuadrado(int lado) {
        this.lado = lado;
        this.perimetro_cuadrado = 4 * lado;
        this.area_cuadrado = lado * lado;
    }

    public int getLado() {
        return lado;
    }

    public int getPerimetro_cuadrado() {
        return perimetro_cuadrado;
    }

    public int getArea_cuadrado() {
        return area_cuadrado;
    }

    public void setLado(int lado) {
        this.lado = lado;
        this.perimetro_cuadrado = 4 * lado;
        this.area_cuadrado = lado * lado;
    }

    public void Perimetro_Cuadrado() {
        System.out.println("El perímetro del cuadrado es: " + getPerimetro_cuadrado());
    }

    public double Area_Cuadrado() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("*********** ");
        return area;
    }
}
