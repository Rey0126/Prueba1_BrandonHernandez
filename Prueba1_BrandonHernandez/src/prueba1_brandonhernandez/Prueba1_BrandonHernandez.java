/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1_brandonhernandez;

import java.util.Scanner;

/**
 *
 * @author brhb2
 */
public class Prueba1_BrandonHernandez {

    static Scanner rd = new Scanner(System.in);
    static Scanner rd2 = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean menu = true;
        //Contador de veces que se muestra el menú principal
        int cont = 0;

        //Ingresamos un valor en duro en el while para que el ciclo pueda ejecutarse desde el inicio, y mientras el valor en duro no se altere o mute, el ciclo se repetira
        while (menu) {

            cont++;
            System.out.println("\nBienvenido a mi primera prueba práctica en Java, las opciones son las siguientes\n");
            System.out.println("1. Repetir mi nombre");
            System.out.println("2. SubMenu de Mensajes");
            System.out.println("3. Salir");

            //Hacemos lectura de la opcion ingresada por el usuario
            System.out.print("Ingrese una opcion: ");
            int opcion = rd.nextInt();
            
            //Evalua la opcion ingresada por el ususario y dependiendo de ella, entra en alguno de los casos y ejecutas las instrucciones dentro de cada uno
            switch (opcion) {

                case 1:

                    System.out.print("Ingrese su nombre: ");
                    String name = rd2.nextLine();
                    System.out.print("Ingrese la cantidad de veces que se repetira: ");
                    int rep = rd.nextInt();

                    for (int i = 0; i < rep; i++) {
                        System.out.println("¡Hola mi nombre es " + name + " y miren mi prueba!");
                    }

                    break;

                case 2:

                    boolean menu2 = true;

                    while (menu2) {

                        System.out.println("\n== SubMenu de Mensajes ==\n");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        System.out.println("3. Salir del SubMenu");
                        System.out.print("Ingrese una opcion: ");
                        int op = rd.nextInt();

                        switch (op) {

                            case 1:

                                System.out.println("\nBienvenido a mi SubMenu de mensajes <3");
                                System.out.println("Te dejo este mensaje\n¡Sin Sacrificio no puede haber victoria!");

                                break;

                            case 2:

                                System.out.println("Hasta luego, gracias por usar mi programa <3");

                                break;

                            case 3:

                                menu2 = false;

                                break;

                            default:
                                System.out.println("Opcion Invalida!!!");

                        }

                    }
                    break;

                case 3:

                    //Cambiamos el valor de la varibale menu y rompemos el ciclo para terminar el mismo
                    menu = false;

                    System.out.println("Adiós, esta fue mi prueba\nLas veces que se mostro el menú principal fueron: " + cont);

                    break;
                    
                    //Si la opcion ingresada por el usuario no es ninguna de las especificadas en cada caso entra al default y muestra el mensaje
                default:
                    System.out.println("Opcion Invalida!!!");

            }

        }

    }

}
