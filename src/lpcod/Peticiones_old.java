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
 * @version: 0.8 Controla las entradas de numeros por teclado 
 * añado opcion grafica con joptionpanels
 *
 */
public final class Peticiones_old {

    private static final boolean DEFAULT_MODE = false;
    private static  Scanner sca = new Scanner(System.in);
    /**
     * Filtro que acepta numeros positivos, negativos y el cero.
     */
    public static final int NEGATIVO_CERO_POSITIVO = 111;
    /**
     * Filtro que acepta numeros positivos y el cero.
     */
    public static final int CERO_POSITIVO = 011;
    /**
     * Filtro que acepta numeros negativos y el cero.
     */
    public static final int NEGATIVO_CERO = 110;
    /**
     * Filtro que acepta numeros positivos.
     */
    public static final int POSITIVO = 001;

    /**
     * Filtro que acepta numeros negativos.
     */
    public static final int NEGATIVO = 100;
    /**
     * Indica que queremos que use cuadros de dialogo para las peticiones de datos.
     */
    public static final boolean GRAFICO = true;
    /**
     * Indica que queremos que use la terminal para las peticiones de datos.
     */
    public static final boolean CONSOLA = false;
/**
 * Este metodo solicita al usuario un double, en caso de no recibir un dato congruente vuelve a pedirlo.
 * @param message mensaje a mostrar en en la peticion de datos.
 * @param modoGrafico   <p>Enviando una constante  <code><strong style="color:green">GRAFICO</strong></code> se ejecuta en modo grafico</p>
 *                      <p>Envidando una constante <code><<strong style="color:green">>CONSOLA</strong></code> se ejecuta en consola.</p>
 * @return devuelve un double.
 */
    
    public static Double pedirNumeroDouble(String message, boolean modoGrafico) {
        Double res = null;

        do {
            if (modoGrafico) {

                res = comprobarNumDouble(JOptionPane.showInputDialog(null,  message));
            } else {
                System.out.print(message );
                res = comprobarNumDouble(sca.nextLine());
                System.out.println();
            }
        } while (res == null);
        // pedira el dato hasta que e introduzca un numero valido.

        return res;
    }
/**
 * Este metodo solicita al usuario un double, en caso de no recibir un dato congruente vuelve a pedirlo.
 * @param message mensaje a mostrar en en la peticion de datos.
 * @return devuelve un double.
 */
    public static Double pedirNumeroDouble(String message) {
        Double res;
        res = pedirNumeroDouble(message, DEFAULT_MODE);
        return res;

    }

    private static Double comprobarNumDouble(String number) {
        Double x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Double.parseDouble(number);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    public static Short pedirNumeroShort(String message) {
        Short res;
        res = pedirNumeroShort(message, DEFAULT_MODE);
        return res;

    }

    public static Short pedirNumeroShort(String message, boolean modoGrafico) {
        Short res = null;

        do {
            if (modoGrafico) {

                res = comprobarNumShort(JOptionPane.showInputDialog(null, message));
            } else {
                System.out.print( message );
                res = comprobarNumShort(sca.nextLine());
                System.out.println();
            }
        } while (res == null);
        // pedira el dato hasta que e introduzca un numero valido.

        return res;
    }

    private static Short comprobarNumShort(String numero) {
        Short x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Short.parseShort(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    public static Integer pedirNumeroInteger(String message) {
        Integer res;
        res = pedirNumeroInteger(message, DEFAULT_MODE);
        return res;

    }

    public static Integer pedirNumeroInteger(String message, boolean modoGrafico) {
        Integer res = null;

        do {
            if (modoGrafico) {

                res = comprobarNumInteger(JOptionPane.showInputDialog(null,   message));
            } else {
                System.out.print(  message  );
                res = comprobarNumInteger(sca.nextLine());
                System.out.println();
            }
        } while (res == null);
        // pedira el dato hasta que e introduzca un numero valido.

        return res;
    }

    private static Integer comprobarNumInteger(String numero) {
        Integer x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    public static Integer pedirNumIntFiltrado(String message, Integer filtro) {
        return pedirNumIntFiltrado(message, filtro, DEFAULT_MODE);
    }

    public static Integer pedirNumIntFiltrado(String message, Integer filtro, boolean modoGrafico) {
        Integer dev = null, temp;
        temp = pedirNumeroInteger(message, modoGrafico);

        switch (filtro) {
            case NEGATIVO:
                if (temp < 0) {
                    dev = temp;
                }
                break;
            case POSITIVO:
                if (temp > 0) {
                    dev = temp;
                }
                break;
            case NEGATIVO_CERO:
                if (temp <= 0) {
                    dev = temp;
                }
                break;

            case CERO_POSITIVO:
                if (temp >= 0) {
                    dev = temp;
                }
                break;
            case NEGATIVO_CERO_POSITIVO: {
                dev = temp;

                break;
            }
        }

        return dev;

    }
 public static Integer pedirNumIntFiltrado(String message, Integer numInicial,Integer numFinal, boolean modoGrafico) {
        Integer dev = null, temp,aux;
        if(numInicial > numFinal){ // comprobando si el numero inicial es realmente el inicial y si no lo es corregirlo
        aux = numInicial;
        numInicial= numFinal;
        numFinal = aux;
               
        }
        
        
        do{
        temp = pedirNumeroInteger(message, modoGrafico);
        }while(numInicial < temp && temp > numFinal);
        dev = temp;

        return dev;

    }
    public static Double pedirNumDoubleFiltrado(String message, Integer filtro) {
        return pedirNumDoubleFiltrado(message, filtro, DEFAULT_MODE);
    }

    public static Double pedirNumDoubleFiltrado(String message, Integer filtro, boolean modoGrafico) {
        Double dev = null, temp;
        do {
            temp = pedirNumeroDouble(message, modoGrafico);

            switch (filtro) {
                case NEGATIVO:
                    if (temp < 0) {
                        dev = temp;
                    }
                    break;
                case POSITIVO:
                    if (temp > 0) {
                        dev = temp;
                    }
                    break;
                case NEGATIVO_CERO:
                    if (temp <= 0) {
                        dev = temp;
                    }
                    break;

                case CERO_POSITIVO:
                    if (temp >= 0) {
                        dev = temp;
                    }
                    break;
                case NEGATIVO_CERO_POSITIVO: {
                    dev = temp;

                    break;
                }
            }
        } while (dev == null);

        return dev;

    }

    public static String DevolverSuperIndice(Integer supInd) {
        String res = "", aux = "";
        String supIndStr = supInd.toString();
        for (int i = 0; i < supIndStr.length(); i++) {
            switch (Integer.parseInt(supIndStr.charAt(i) + "")) {
                case 0:
                    aux = "\u2070";
                    break;
                case 1:
                    aux = "\u00B9";
                    break;
                case 2:
                    aux = "\u00B2";
                    break;
                case 3:
                    aux = "\u00B3";
                    break;
                case 4:                    aux = "\u2074";
                    break;

                case 5:
                            aux = "\u2075";
                    break;
                case 6:
                    aux = "\u2076";                    break;

                case 7:
                    aux = "\u2077";
                    break;
                case 8:
                    aux = "\u2078";
                    break; 
                case 9:
                    aux = "\u2079";
                    break;

            }
            res = res.concat(aux);
        }

        return res;
    }
    
    public static String formateadorFechas(GregorianCalendar fecha){
   String dev = "null";
    if(fecha != null){
    dev = fecha.get(GregorianCalendar.DAY_OF_MONTH) + "-" +fecha.get(GregorianCalendar.MONTH)+ "-"+ fecha.get(GregorianCalendar.YEAR) + "    " +fecha.get(GregorianCalendar.HOUR_OF_DAY)+ ":" + fecha.get(GregorianCalendar.MINUTE) + ":"+ fecha.get(GregorianCalendar.SECOND);
    }
   
   return dev;}
    
//    public static int menu(String[] opciones){
//    Integer x = 0;
//    
//    for(String opcion : opciones){
//    System.out.println( opcion);
//    
//    
//    }
//    
//    return x;
//    }
    
    
}
