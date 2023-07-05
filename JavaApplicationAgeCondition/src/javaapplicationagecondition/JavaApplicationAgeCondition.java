/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationagecondition;

import java.util.Scanner;

/**
 *
 * @author mtarazona
 */
public class JavaApplicationAgeCondition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 0 && age <= 11) {
            System.out.println("Child");
        }else if(age >= 12 && age <= 17) {
            System.out.println("Teen");
        }else if(age >= 18 && age <= 64) {
            System.out.println("Adult");
        }else{
            System.out.println("0 >= age <= 64");
        }
                        
    }
    
}