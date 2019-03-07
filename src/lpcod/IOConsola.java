/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpcod;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class IOConsola extends IO {

    private static Scanner sca = new Scanner(System.in);
    
    public IOConsola() {
        
    }
    
    /**
 * Este metodo solicita al usuario un double, en caso de no recibir un dato congruente vuelve a pedirlo.
 * @param message mensaje a mostrar en en la peticion de datos.
 * @return devuelve un double.
 */

    @Override
    public Double pedirNumeroDouble(String message) {
        Double res = null;
       
        do{System.out.print(message);
        res = comprobarNumDouble(sca.nextLine());
        System.out.println();
         } while (res == null);
        return res;
    }
/**
 * Este metodo solicita al usuario un short, en caso de no recibir un dato congruente vuelve a pedirlo.
 * @param message mensaje a mostrar en en la peticion de datos.
 * @return devuelve un short.
 */
    @Override
    public Short pedirNumeroShort(String message) {
       
        Short res = null;
       do{
        System.out.print(message);
        res = comprobarNumShort(sca.nextLine());
        System.out.println();
         } while (res == null);
        return res;
    }
/**
 * Este metodo solicita al usuario un integer, en caso de no recibir un dato congruente vuelve a pedirlo.
 * @param message mensaje a mostrar en en la peticion de datos.
 * @return devuelve un integer.
 */
    @Override
    public Integer pedirNumeroInteger(String message) {
       
        Integer res = null;
        do{
        System.out.print(message);
        res = comprobarNumInteger(sca.nextLine());
        System.out.println();
         } while (res == null);
        return res;
        
    }

    

}
