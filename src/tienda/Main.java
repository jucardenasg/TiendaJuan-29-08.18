/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Estudiante
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Fecha Fnacimiento = new Fecha(10,10,1980);
    Fecha Fingreso = new Fecha(20,5,2003);
    Empleado empleado1 = new Empleado("Pedro",Fnacimiento,Fingreso,"M","F");
    Fecha Fingreso2 = new Fecha(20,5,2004);
    empleado1.setFingreso(Fingreso2);
    }
    
}
