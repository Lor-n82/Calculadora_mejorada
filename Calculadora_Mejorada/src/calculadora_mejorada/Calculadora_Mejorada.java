/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_mejorada;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Calculadora_Mejorada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int deseo /*sino,*/;
        float num1 = 0, num2 = 0;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("*****************");
            System.out.println("Calculadora");
            System.out.println("*****************");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.println("");

            System.out.print("Introduce la opcion deseada: ");
            deseo = teclado.nextInt();

            if (deseo > 0 && deseo < 5) {
                System.out.print("Introduce el primer numero: ");
                num1 = teclado.nextFloat();
                System.out.print("Introduce el segundo numero: ");
                num2 = teclado.nextFloat();
            }
            /*switch (deseo) {
                case 1:
                    System.out.println("El resultado de " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado de " + num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Numero introducido no valido... Reiniciando programa");
                    break;
            }*/
            if (deseo == 1 || deseo == 2 || deseo == 3 || deseo == 4) {
                //Pedir datos solo aquí
                if (deseo == 1) {
                    System.out.println("El resultado de " + num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (deseo == 2) {
                    System.out.println("El resultado de " + num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (deseo == 3) {
                    System.out.println("El resultado de " + num1 + " * " + num2 + " = " + (num1 * num2));
                } else if (deseo == 4) {
                    System.out.println("El resultado de " + num1 + " / " + num2 + " = " + (num1 / num2));
                }
            } else if (deseo == 5) {
                System.out.println("Fin");
            } else {
                System.out.println("Opción " + deseo + " no disponible, vuelva a intentarlo.");
            }

        } while (deseo != 5);
    }
}
