package main;

import java.util.Random;
/**
 * Clase que modela la carga de números enteros a una matriz de 3x3 a partir del
 * ingreso de datos por teclado, en forma aleatoria o por una variable
 */
import javax.swing.JOptionPane;

class LlenarMatriz {

    private int[][] m;
    private String salida;
//Constructor de la clase

    public LlenarMatriz() {
        final int TAMAÑO = 3;
        m = new int[TAMAÑO][TAMAÑO];
        salida = "";
    }

    /**
     * Método que permite cargar datos en la matriz. a partir de datos
     * ingresados por teclado
     */
    public void inicializarTeclado() {
        String dato = "";
        int totalDatos = 9;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                dato = JOptionPane.showInputDialog(
                        "Le faltan digitar" + totalDatos-- + "\nNúmero ");
                m[ i][ j] = Integer.parseInt(dato);
            }
        }
    }

    /**
     * Método que permite cargar datos en la matriz. a partir de una variable
     * que incrementa con valores constantes
     */
    public void inicializarVariable() {
        int cont = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = cont;
                cont++;
            }
        }
    }

    /**
     * Método que permite cargar datos en la matriz. con valores aleatorios.
     */
    public void inicializarAleatoriamente() {
        Random rnd = new Random();
        final int VALOR_MAXIMO = 50;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rnd.nextInt(VALOR_MAXIMO);
            }
        }
    }

    /**
     * Método que retorna true, si encuentra elemento en la matriz y false en
     * caso contrario
     *
     * @param x
     * @return true o false
     */
    public boolean buscarElemento(int x) {
        boolean respuesta = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[ 0].length; j++) {
                if (x == m[ i][ j]) {
                    respuesta = true;
                }
            }
        }
        return respuesta;
    }

    /**
     * Método que imprime los elementos de la matriz.
     */
    public String imprimirMatriz() {
        salida = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
//se anexan a salida el valor de la matriz y un espacio
                salida += m[i][j] + " ";
            }
//se anexan a salida un salto de linea
            salida += "\n";
        }
        return salida;
    }
}