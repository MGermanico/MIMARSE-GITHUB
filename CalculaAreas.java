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
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t--->\tElige una figura geométrica:\n\n"
                + "1.Triangulo\n"
                + "2.Cuadrado\n"
                + "3.(n)Ágono\n\n");
    }
	public static void cuadrado(int n) {
	System.out.println(n * n);
	}
}
