/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.programa03;

/**
 *
 * @author btoarriola
 */
public class Programa03 {

    public static void main(String[] args) {
//        ClaseConcreta c=new ClaseConcreta();
//        c.imprimir();
//        
//        ClaseAHija cah= new ClaseAHija();
//        cah.imprimir();
//        
//        ClaseA ca=null;
//        ca= new ClaseAHija();
//        ca.imprimir();
//        
//        ca= new ClaseAHija2();
//        
//        ca.imprimir();
//        
//        ca= new ClaseA(){
//            @Override
//            public void msg(){
//                System.out.println("hola clase anonima");
//            }
//        };
//        
//        ca.imprimir();
          
        IClaseInterface eje=null;
        eje = new IClaseConcretaUno();
        eje.msg();
        
        eje = new IClaseConcretaDos();
        eje.msg();
        
        eje= new IClaseInterface() {
            @Override
            public void msg() {
                System.out.println("Clase anonima hola interface");
            }
        };
        eje.msg();
    }
}
