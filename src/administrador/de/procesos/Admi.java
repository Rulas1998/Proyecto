/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador.de.procesos;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class Admi {
   private LinkedList<String>tareas = new LinkedList<String>();
   private LinkedList<Proceso> Lista= new LinkedList<Proceso>();
   private LinkedList<Proceso> Lista2= new LinkedList<Proceso>();
   private Proceso Prueba;
   public Admi(){
       
   }
   public void generarLista(Proceso x){
           Lista.add(x);
       
   }
   public void VerLista(){
       for(Proceso d:Lista){
           System.out.print(" |"+d.ObtenerNombre()+"|");
           d.VerTareas();
       }
   }
   public void ClasificarOperaciones(){
      int i=0;int mayor=0;int dd=0; int p=1;
      for(Proceso h:Lista){
      tareas.add((Lista.get(i).ObtenerTama(i))+"");
       i++;}
      Collections.sort(tareas);
      Lista2.addAll(Lista);
      System.out.println("\t"+tareas);
      for (int s = 0; s < Lista2.size(); s++) {
      for (int j = 0; j < tareas.size(); j++) {           
             if(Lista2.get(s).ObtenerTama(s)==Integer.parseInt(tareas.get(j)+"")){
//                      System.out.println(p+"I =  "+tareas.get(j)+"-"+dd);
//                     if((p)==Integer.parseInt(tareas.get(j)+"")){
//                        dd++;p++;
//                       if(dd==1){
//                           System.out.println("nada"+Lista.get(s).ObtenerNombre());
//                           dd=0;
//                     }else{
//                    
                  Lista.set(j,Lista2.get(s));  
                 }
             }}}
         
   public void Ejecucion(int d){
       String Secuencia="Secuencia de Ejecucion Proceso "+Lista.get(d).ObtenerNombre()+" ";
       int tam= Lista.get(d).ObtenerTama(d);
       for (int i = 0; i <= tam;i++) {       
       Secuencia+= (Lista.get(d).ObtenerTarea(i)+"").replace("CPU","|");
      Secuencia= Secuencia.replace("E/S"," |XX| ");

   }System.out.println("\t"+Secuencia);}
}
