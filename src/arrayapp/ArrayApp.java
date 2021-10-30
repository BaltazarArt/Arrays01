/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

import java.util.ArrayList;

/**
 *
 * @author reyes
 */
public class ArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primer ejemplo
        String[] alumnos = {"Guillermo", "Roberto", "Carlos", "Juan", "Mario", "Tomas"};
        System.out.println("longitud=" + alumnos.length);
        //Segundo ejemplo
        System.out.println("________");
        String[] materias = new String[5];
        System.out.println("longitud=" + materias.length);
        System.out.println("elemento[0]=" + materias[0]);
        materias[0]="Estructura de datos";
        materias[1]="IO";
        materias[2]="Economia";
        materias[3]="Contabilidad";
        materias[4]="Programacion web";
        System.out.println("elemento[3]=" + materias[3]);
        System.out.println("________");
        //tercer ejemplo
        System.out.println("________");
        float[] costos = new float[3];
        System.out.println("longitud=" + costos.length);
        System.out.println("elemento[0]=" + costos[0]);
        System.out.println("elemento[2]=" + costos[2]);
        costos[0]=(float)10;
        costos[1]=(float)89;
        costos[2]=(float)89;
        System.out.println("elemento[2]=" + costos[2]);
        //cuarto ejemplo
        System.out.println("________");
        float []costos1={(float) 10.56,(float) 12.56,(float) 1.56,(float) 14.56 };
                System.out.println("llongitud="+costos1.length);
                System.out.println("elemento[2]=" + costos1[2]);
                
                
                
                ArrayList<prueba> p1=new ArrayList<prueba>();
                prueba prueba1=new prueba(1,"AC");
                p1.add(prueba1);
                
                prueba prueba2=new prueba(2,"BA");
                p1.add(prueba2);
                
                System.out.println("longitud de arreglo de objetos:"+ p1.size());
                
                System.out.println("datos del objeto 1:" + p1.getEstatus());             
                

    }
}
