/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2carlos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lab2carlos {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        boolean centinela = true;
        double descuento = 0;
        int seguir = 1;
        int seguir2 = 1;
        while(centinela == true){
            System.out.println("Laboratorio 2");
            System.out.println("1) discount");
            System.out.println("2) puntos colineales");
            System.out.println("3)los tres chiflados");
            System.out.println("4) Salir");
            int opcion = lea.nextInt();
            if (opcion == 1) {
                while (seguir == 1){
                System.out.println("Ingrese el subtotal");
                double subtotal = lea.nextDouble();
                while(subtotal < 0){
                    System.out.println("Ingrese un numero valido");
                    subtotal = lea.nextDouble();
                }
                if (subtotal < 3000.00 ){
                    descuento = subtotal * 0.10;
                }else{
                    if (subtotal >= 3000 && subtotal < 500){
                        descuento = subtotal * 0.20;
                }else{
                        if (subtotal >= 5500){
                            descuento = subtotal * 0.30;
                        }
                    }
                }
   
                double total = subtotal - descuento;
                System.out.println("su total es; "+total);
                System.out.println("Desea calcular el total de pagar a otro cliente");
                seguir = lea.nextInt();
                }
            }else{
                if (opcion == 2){
                    while (seguir2 == 1){
                        System.out.println("Ingrese coordenada x de P:");
                        int coor1 = lea.nextInt(); 
                        System.out.println("Ingrese coordenada y de P:");
                        int coor2 = lea.nextInt();
                        System.out.println("Ingrese coordenada x de Q:");
                        int coor3 = lea.nextInt();
                        System.out.println("Ingrese coordenada y de Q:");
                        int coor4 = lea.nextInt();
                        System.out.println("Ingrese coordenada x de R:");
                        int coor5 = lea.nextInt();
                        System.out.println("Ingrese coordenada y de R:");
                        int coor6 = lea.nextInt();
                        double pendiente = coor2 - coor4 / coor3 - coor1;
                        double pendiente2 = coor3 - coor5 / coor4 - coor6;
                        if (pendiente == pendiente2){
                            System.out.println("Los puntos son colineales");
                        }
                        System.out.println("Desea ingresar otro punto");
                        seguir2 = lea.nextInt();
                    }
                }else{
                    if (opcion == 3){
                        do {
                            int larry,moe,curly;
                             System.out.print("Ingrese el número de Larry: ");
                             larry = lea.nextInt();
                             System.out.print("Ingrese el número de Moe: ");
                             moe = lea.nextInt();
                             System.out.print("Ingrese el número de Curly: ");
                             curly = lea.nextInt();

                             int diff1 = Math.abs(larry - moe);
                             int diff2 = Math.abs(larry - curly);
                             int diff3 = Math.abs(moe - curly);

                             if (diff1 > diff2 && diff1 > diff3) {
                                System.out.println("El número mas alejado es " + moe);
                                System.out.println("¡Moe debe pagar!");
                            } else if (diff2 > diff1 && diff2 > diff3) {
                                System.out.println("El número mas alejado es " + curly);
                                System.out.println("¡Curly debe pagar!");
                            } else if (diff3 > diff1 && diff3 > diff2) {
                                System.out.println("El número mas alejado es " + larry);
                                System.out.println("¡Larry debe pagar!");
                            } else {
                                System.out.println("Los números son muy cercanos entre sí, no hay perdedor.");
                            }
                             System.out.print("¿Desea jugar una vez más? (1 para sí, 0 para no): ");
                        } while (lea.nextInt() == 1);
                        System.out.println("¡Hasta luego!");
                    }else{
                        if (opcion == 4){
                            centinela = false;
                        }
                    }
                }
            }
        }
    }
}

