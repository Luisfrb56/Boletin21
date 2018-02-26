/*
*  lea unha lista de palabras dende o teclado.
* Ordene alfabéticamente estas palabras.
* Escriba o resultado nun ficheiro de texto de xeito que, cada palabra estea nunha liña e éstas esten numeradas 
*/
package boletin21;



public class Boletin21 {

  
    public static void main(String[] args) {
     ArrayPalabras obx=new ArrayPalabras();
     obx.recorrerArray();
     obx.mostrarArray();
     System.out.println("\n");
     obx.ordenarArray();
     obx.mostrarArray();
     obx.guardarArchivo();
    }
    
}
