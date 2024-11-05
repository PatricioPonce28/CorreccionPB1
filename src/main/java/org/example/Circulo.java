package org.example;

public class Circulo {
    private double radio;
    private double peri_cir;
    private double area_cir;

    public Circulo(double radio) {
        this.radio = radio;
        this.peri_cir = 2 * 3.14 * radio;
        this.area_cir = 3.14 * radio * radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getPeri_cir() {
        return peri_cir;
    }

    public double getArea_cir() {
        return area_cir;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        this.peri_cir = 2 * 3.14 * radio;
        this.area_cir = 3.14 * radio * radio;
    }

    public void Perimetro_Circulo() {
        System.out.println("El perímetro del círculo es: " + getPeri_cir());
    }

    public double Area_Circulo() {
        double area = 3.14 * radio * radio;
        System.out.println("El área del círculo es: " + area);
        System.out.println("*********** ");
        return area;
    }
}


