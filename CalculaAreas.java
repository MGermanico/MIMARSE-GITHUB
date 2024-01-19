/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculaareas;

import java.util.Scanner;

/**
 *
 * @MiguelMarcosAntonio dev
 */
public class CalculaAreas {
    public static void main(String[] args) {
        boolean seguir = true;
        while(seguir){
        	 seguir = menu();
        }
    }
    public static boolean menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t--->\tElige una figura geométrica:\n\n"
                + "1.Triangulo\n"
                + "2.Cuadrado\n"
                + "3.(n)Ágono\n\n"
                + "S.Salir\n\n");
        String res = sc.nextLine();
        if(res.equals("S")){
            return false;
        }else{
            if (res.equals("1")) {
            	 System.out.println("Introduzca la base y la altura");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                triangulo(b, h);
            }else if (res.equals("2")) {
                System.out.println("Introduzca el lado del cuadrado: ");
                double l = sc.nextDouble();
                cuadrado(l);
            }else if (res.equals("3")) {
                System.out.println("Introduzca el lado, apotema y numero de lados del polígono: ");
                double l = sc.nextDouble();
                double a = sc.nextDouble();
                double n = sc.nextDouble();
                nagono(l, a, n);
            }
            return true;
        }
    }
    public static void triangulo(double base, double altura){
        System.out.println(base * altura / 2);
    }
    public static void cuadrado(double n) {
        System.out.println(n * n);
    }
    public static void nagono(double l, double a, double n){
        System.out.println(((l*a)/2)*n);
    }
}
