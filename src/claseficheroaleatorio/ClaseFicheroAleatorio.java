/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseficheroaleatorio;

import java.io.*;



public class ClaseFicheroAleatorio {

  
    public static void main(String[] args) throws IOException {
        
        File fichero=new File("carpeta/fichero.txt");
            //estos son dos objetos de tipo file, uno en modo fichero el otro en modo carpeta
        File directorio=new File("carpeta");

//        System.out.println("Creando directorio...");
//        
//        boolean bool_dir=false;
//        bool_dir=directorio.mkdir();
//        //se muestra por pantalla la variable
//        if(bool_dir==true){
//        System.out.println("el directorio se ha creado");
//        }else{
//            System.out.println("error (seguro que ya esta creado)");
//        }
//        
//        System.out.println("\n");
//        
//        System.out.println("Creando fichero...");
//        boolean bool_file = false;
//        bool_file = fichero.createNewFile();
//       
//           if(bool_file==true){
//        System.out.println("el directorio se ha creado");
//        }else{
//            System.out.println("error (seguro que ya esta creado)");
//        }
//        System.out.println("\n");

///////////////////////////////////////////////////////////////////////////////
//esto de arriba es para crear la carpeta y fichero
  
    System.out.println("Existencia:");
    if(directorio.exists()==true){
        System.out.println("el directorio SI existe");
        }else{
            System.out.println("no existe el directorio");
        }
       if(fichero.exists()==true){
        System.out.println("el fichero SI existe");
        }else{
            System.out.println("no existe el fichero");
        }
       System.out.println("\n");
       
       System.out.println("Es directorio:");
       System.out.println("el directorio"+directorio.isDirectory());
        System.out.println("el fichero"+fichero.isDirectory());
        
       
       System.out.println("\n");
       
       System.out.println("Es fichero:");
       System.out.println("el directorio "+directorio.isFile());
        System.out.println("el fichero "+fichero.isFile());
 
       System.out.println("\n");
       
         
        System.out.println("Ruta absoluta:");
        System.out.println("el directorio: "+directorio.getAbsolutePath());
        System.out.println("el fichero: "+fichero.getAbsolutePath());



    }
    
}
