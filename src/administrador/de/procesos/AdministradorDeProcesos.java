/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador.de.procesos;

/**
 *
 * @author USUARIO
 */
public class AdministradorDeProcesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //este es un cambio
        
        Admi Admixd= new Admi();      
        Proceso p1= new Proceso("P1",10,"Tarea Chida",1,0);
        p1.CrearListadeTarea();
        System.out.println("\t"+p1.ObtenerNombre());
       // p1.VerTareas();          
        Proceso p2= new Proceso("P2",10,"Tarea Chidax",1,0);
        p2.CrearListadeTarea();
       System.out.println("\t"+ p2.ObtenerNombre());
       // p2.VerTareas();
         Proceso p3= new Proceso("P3",10,"Tarea Chida",1,0);
        p3.CrearListadeTarea();
          System.out.println("\t"+ p3.ObtenerNombre());
          Proceso p4= new Proceso("P4",10,"Tarea Chida",1,0);
        p4.CrearListadeTarea();
          System.out.println("\t"+ p4.ObtenerNombre());
        Admixd.generarLista(p1);   
        Admixd.generarLista(p2);
        Admixd.generarLista(p3);
        Admixd.generarLista(p4);
        System.out.println("PROCESO");
        Admixd.VerLista();
        Admixd.ClasificarOperaciones();
        System.out.println("LISTA ORDENADA COMPA");
         Admixd.VerLista();
         Admixd.Ejecucion(0);
         Admixd.Ejecucion(1);
         Admixd.Ejecucion(2);
         Admixd.Ejecucion(3);
        System.out.print(  p1.getEstado());
               System.out.print(  p1.getEstado());
                      System.out.print(  p1.getEstado());
                             System.out.print(  p1.getEstado());
        
    }
    
}
