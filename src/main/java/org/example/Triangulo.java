package org.example;

public class Triangulo {
    private int basetri;
    private int alturatri;
    private int peri_trian;
    private int area_trian;

    // Constructor solo con base y altura
    public Triangulo(int basetri, int alturatri) {
        this.basetri = basetri;
        this.alturatri = alturatri;
        this.peri_trian = alturatri + alturatri + basetri;
        this.area_trian = (basetri * alturatri) / 2;
    }

    public int getBasetri() {
        return basetri;
    }

    public int getAlturatri() {
        return alturatri;
    }

    public int getPeri_trian() {
        return peri_trian;
    }

    public int getArea_trian() {
        return area_trian;
    }

    public void setTrian(int basetri, int alturatri) {
        this.basetri = basetri;
        this.alturatri = alturatri;
        this.peri_trian = alturatri + alturatri + basetri;
        this.area_trian = (basetri * alturatri) / 2;
    }

    public void Perimetro_Triangulo() {
        System.out.println("El perímetro del Triángulo es: " + getPeri_trian());
    }

    public double Area_Triangulo() {
        double area = (basetri * alturatri) / 2.0;
        System.out.println("El área del Triángulo es: " + area);
        System.out.println("*********** ");
        return area;
    }
}
