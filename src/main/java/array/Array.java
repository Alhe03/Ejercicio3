package array;

import java.util.Scanner;

public class Array {
    Integer [] array;
    int contador=0;

    public Array (int sizeArray){
        this.contador =0;
        this.array= new Integer[sizeArray];
    }

    public static void capturarDatos (Scanner scanner, Array array){
        int contador =0;
        System.out.println("Introduce todo tu arreglo");
        while (contador< array.getElementos().length){
            array.addElemento(scanner.nextInt());
            contador++;
        }
    }

    public void addElemento(Integer elem){
        if (contador < array.length){
            array[contador] = elem;
            contador++;
        }
    }

    public Integer [] getElementos() {
        return array;
    }

    public  void recorre(Integer[] array){
        int i;
        int j=1;
        int ban=0;
        int ban2;
        for ( i=0; i <array.length-1; i++){
            ban2= i+1;
            for (j=ban2; j < array.length; j++){
             if (array[i]==array[j]){
                 System.out.println("Repetidos el "+ array[i]+" en la posición "+ i+" y "+j);
                 ban=1;
             }
           // System.out.println(array[i]);
        }
        }
        if (ban ==0)System.out.println("Tu arreglo NO tiene elementos repetidos");
    }





}
