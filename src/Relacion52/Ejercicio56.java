package Relacion52;

import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class Ejercicio56 {

    public static void main(String[] args){
        Ejercicio56 op = new Ejercicio56();
        op.comprobar();
        op.Calc_area();
        op.Calc_perimetro();
        System.out.println("Area: "+ op.area);
        System.out.println("Perimetro: " + op.perimetro);
    }

    Scanner datos = new Scanner(System.in);

    float area, perimetro, base, altura;

    public void comprobar(){
        System.out.print("Introduce la base y la altura: ");
        while (!datos.hasNextFloat()){
            System.out.println("Algo no ha funcionao");
            datos.nextLine();
        }
        base = datos.nextFloat();
        datos.nextLine();
        while (!datos.hasNextFloat()){
            System.out.println("Algo no ha funcionao");
            datos.nextLine();
        }
        altura = datos.nextFloat();
    }


    public float Calc_area(){
        area = base * altura;
        return area;
    }
    public float Calc_perimetro(){
        perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }
}
