/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author oo
 */
public class MatrizProceso {

    private int numFilas;
    private int numCol;
    private int[][] m;
    private int suma;

    public void MatrizProceso(int p_numFilas, int p_numCol) {
        numFilas = p_numFilas;
        numCol = p_numCol;
        m = new int[numFilas][numCol];
    }

    public int[][] llenarMatriz() {
        Random rnd = new Random();
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                m[f][c] = rnd.nextInt(10);
            }
        }
        return m;
    }

    public String imprimirMatriz() {
        String matrix = "";
        for (int f = 0; f < m.length; f++) {
            //arreglo = arreglo + this.m[f][0] + " - ";
            for (int c = 0; c < m[f].length; c++) {
                
                if ( c < this.numCol - 1 ) {
                         matrix = matrix + this.m[f][c] + " - ";             
                }
                    if (c == this.numCol - 1) {               
                    matrix = matrix + this.m[f][c] + "\n";
                }               
            }
        }
        return matrix;
    }

    public int sumarElementos() {
        int sum = 0;
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                sum += m[f][c];
            }
        }
        return sum;
    }

    public int sumarDiagonal() {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;

    }

    public String obtenerDiagonalSecundaria() {
        return null;

    }

    public boolean buscarElemento(int x) {
        return false;
    }
}
