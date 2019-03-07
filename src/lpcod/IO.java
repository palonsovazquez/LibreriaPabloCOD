/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. V 0.1
 */
package lpcod;

import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author: Pablo Alonso Vazquez
 * @version: 0.9 Controla las entradas de numeros por teclado 
 * añado opcion grafica con joptionpanels
 * modificado en esta rama con el patron de diseño Abstract factory
 *
 */
public abstract class IO implements InterfaceIO {

    public  IO Crear(Tipo tipo) {
       IO res =null;
        switch(tipo){
            case VENTANA:{
            res = new IOVentana();
            break;}
            case CONSOLA:{
            res = new IOConsola();
            
            break;}
        
        }
        
   return res; }

   
   protected  Double comprobarNumDouble(String number) {
        Double x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Double.parseDouble(number);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    protected  Short comprobarNumShort(String numero) {
        Short x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Short.parseShort(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    protected  Integer comprobarNumInteger(String numero) {
        Integer x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }
    

    
}
