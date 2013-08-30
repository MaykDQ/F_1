package main;

import javax.swing.JOptionPane;

/**
 * clase que modela la lectura de la cadena e impresión de los resultados
 *
 * @version 1.0
 */
public class Cadena {

    /**
     * atributos
     */
    private String cadena;
//se define objeto de la clase OperacionCadena
    private OperacionCadena operacion;

    /**
     * constructor de la clase cadena
     */
    public Cadena() {
        this.cadena = "";
        this.operacion = new OperacionCadena();
    }

    /**
     * método en el que se realiza la lectura de la cadena e impresión de los
     * resultado de operaciones con la cadena
     */
    public void leerCadena() {
        String resultados = "";
        int tam = 0;
//se lee la cadena por teclado
        cadena = JOptionPane.showInputDialog("Digite Cadena ");
        System.out.println("Impresión de la cadena ");
        operacion.imprimirCaracteres(cadena);
        tam = operacion.obtenerlongitudCadena(cadena);
        System.out.println("\nLa Longitud de la cadena: " + tam + " caracteres ");
        System.out.println("\nLa cadena texto en mayúsculas: "
                + operacion.convertirMayusculas(cadena));
        System.out.println("La cadena texto en minúsculas: "
                + operacion.convertirMinusculas(cadena));
    }

    /**
     * metodo principal, para iniciar la ejecución del proyecto
     *
     * @param args
     */
    public static void main(String[] args) {
//definción del objeto str de la clase Cadena
        Cadena str = new Cadena();
        str.leerCadena();
    }
}
