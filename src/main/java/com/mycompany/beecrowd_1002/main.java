package com.mycompany.beecrowd_1002;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        float raio;
        double area;
        Scanner Leitor = new Scanner(System.in);
        raio = Float.parseFloat(Leitor.nextLine());
        area = 3.14159 * (raio * raio);
        System.out.printf("A=%.4f\n" , area);
    }
}
