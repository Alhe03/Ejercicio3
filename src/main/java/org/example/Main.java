package org.example;

import java.util.Scanner;
import array.Array;
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Cual seria el tamaño del arreglo: ");
            Array array = new Array(scanner.nextInt());
            array.capturarDatos(new Scanner(System.in), array);
            //suma(array.getElementos());
            array.recorre(array.getElementos());

        }

     /*   public static void suma(Object[] elemento){
            Integer [] s = new Integer[elemento.length];
            Integer suma = 0.0;
            for (int i=0; i <elemento.length; i++){
                s [i] = (double)(char) elemento[i];
                suma +=s [i];
            }
            System.out.println("SUMA"+ suma   );
        }



       */



    }