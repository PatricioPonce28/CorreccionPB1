package org.example;

public class Rectangulo {
    private int base;
    private int altura;
    private int peri_rect;
    private int area_rect;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.peri_rect = (2 * base) + (2 * altura);
        this.area_rect = base * altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeri_rect() {
        return peri_rect;
    }

    public int getArea_rect() {
        return area_rect;
    }

    public void setDimensiones(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.peri_rect = (2 * base) + (2 * altura);
        this.area_rect = base * altura;
    }

    public void Perimetro_Rectangulo() {
        System.out.println("El perímetro del rectángulo es: " + getPeri_rect());
        System.out.println("*********** ");
    }

    public double Area_Rectangulo() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("*********** ");
        return area;
    }
}

