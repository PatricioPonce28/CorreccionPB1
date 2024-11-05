import org.example.Circulo;
import org.example.Cuadrado;
import org.example.Rectangulo;
import org.example.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Primer Objeto: Cuadrado");
        System.out.println("Ingrese un lado del cuadrado: ");
        int lado = input.nextInt();
        Cuadrado c1 = new Cuadrado(lado);

        double areaCuadrado = c1.Area_Cuadrado();

        System.out.println("Segundo Objeto: Rectángulo");
        System.out.println("Ingrese la base del rectángulo: ");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del rectángulo: ");
        int altura = input.nextInt();
        Rectangulo r1 = new Rectangulo(base, altura);

        double areaRectangulo = r1.Area_Rectangulo();

        System.out.println("Tercer Objeto: Círculo");
        System.out.println("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();
        Circulo cir1 = new Circulo(radio);

        double areaCirculo = cir1.Area_Circulo();

        System.out.println("Cuarto Objeto: Triángulo");
        System.out.println("Ingrese la base del triángulo: ");
        int basetri = input.nextInt();
        System.out.println("Ingrese la altura del triángulo: ");
        int alturatri = input.nextInt();
        Triangulo t1 = new Triangulo(basetri, alturatri);

        double areaTriangulo = t1.Area_Triangulo();

        double sumaTotal = areaCuadrado + areaRectangulo + areaCirculo + areaTriangulo;
        System.out.println("La suma de las áreas es: " + sumaTotal);
    }
}
