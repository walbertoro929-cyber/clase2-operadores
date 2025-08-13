/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author hutao
 */
public class operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        




    
        Scanner sc = new Scanner(System.in);

        // Solicitar notas
        System.out.print("Ingrese nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese nota 3: ");
        double nota3 = sc.nextDouble();

        // Calcular nota final
        double notaFinal = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40);

        System.out.printf("Nota final: %.2f%n", notaFinal);

        // Evaluar usando if-else
        if (notaFinal >= 1 && notaFinal <= 1.9) {
            System.out.println("Deficiente");
        } else if (notaFinal >= 2 && notaFinal <= 2.9) {
            System.out.println("Insuficiente");
        } else if (notaFinal >= 3 && notaFinal <= 3.9) {
            System.out.println("Aceptable");
        } else if (notaFinal >= 4 && notaFinal <= 5) {
            System.out.println("Destacado");
        } else {
            System.out.println("Nota fuera de rango");
        }

        sc.close();
    }
}

   
     
    

