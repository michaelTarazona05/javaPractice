/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationcolor;

import  java.util.Scanner;
/**
 *
 * @author mtarazona
 */
public class JavaApplicationColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        
        switch(color) {
        case "red" -> System.out.println(1);
        case "green" -> System.out.println(2);
        case "black" -> System.out.println(3);
        default -> {
            System.out.println("Another color");
            System.out.println("Hola mundo!!!");
        }   
}
}
}