
package boletin21;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class ArrayPalabras {
    String [] palabras=new String[5];
    FileWriter fichero = null;
        PrintWriter pw = null;
    public void recorrerArray(){
        
    
    for( int i=0;i<palabras.length;i++){
    palabras[i]=JOptionPane.showInputDialog("Dime la palabra que quieres guardar en el fichero", null);
    }
    }
    
    public void mostrarArray(){
    for( int i=0 ;i<palabras.length;i++){
        System.out.println(palabras[i]);}
    }
  public void ordenarArray(){
      Arrays.sort(palabras);
      
  }
  public void guardarArchivo(){
          try
        {
            fichero = new FileWriter("pordenadas.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < palabras.length; i++)
                pw.println((i+1)+ " " + palabras[i]);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
        }
  }
}

