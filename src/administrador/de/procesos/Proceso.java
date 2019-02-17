/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador.de.procesos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proceso {
    private String nombre="";
    private int numeroTareas;
    private String descripcion="";
    private int idProceso;
    private int estado;
    private LinkedList<String>tareas = new LinkedList<String>();
    
    public Proceso(){
        
    }
    
     public Proceso(String nombre,int numeroTareas,String descripcion,int idProceso, int estado){
this.nombre=nombre;
 this.numeroTareas= numeroTareas;
 this.descripcion= descripcion;
 this.idProceso=idProceso; 
 this.estado= estado; 
    }
public void CrearListadeTarea(){

String w="";int tam=0;
Scanner Flujo= new Scanner(System.in);
System.out.println("Ingrese Numero de Tareas");
tam=Flujo.nextInt();
System.out.println("Ingrese tareas");
       for (int i = 0; i <= tam; i++) {
        w=Flujo.nextLine();
        tareas.add(w);
    }
    
} 
public String ObtenerTarea(int i){
   return tareas.get(i);
}
public int ObtenerTama(int i){
   return  tareas.size()-1;
} 
public void EditarTarea(int i,String g){
    tareas.set(i, g);
} 
public String ObtenerNombre(){
  return nombre;
} 
public void VerTareas(){
    
   for (Object i:tareas){
       System.out.print(i.toString()+" \t");
   }System.out.println("\n");}

public String VerTar(int d){
return tareas.get(d)+" \t";
   }
public  LinkedList<String> Ordenar(){

      return tareas;
}
public void editarPosicion(int posicion,String valor){
    tareas.set(posicion, valor);
    System.out.println(tareas);
}
public int getEstado(){
    return estado;
}
public void setEstado(int d){
   estado= d;
}
 
}
