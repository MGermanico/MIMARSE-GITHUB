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
                
            }else if (res.equals("2")) {
                
            }else if (res.equals("3")) {
                
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
