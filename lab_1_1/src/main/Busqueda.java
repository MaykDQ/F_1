package main;

import java.util.Random;

/**
 * clase que modela las operaciones de un vector. crear, imprimir, buscar,
 * ordenar
 *
 * @ Project : Operacion Vectores
 * @ File Name : Busqueda.java
 * @author : Miguel Hernández
 * @version 1.0
 */
public class Busqueda {

    private int[] v;
    final int VALOR_MAXIMO = 50;

    public Busqueda() {
        final int size = 10;
        this.v = new int[size];
    }

    /**
     * método que inicializa el vector. con valores aleatorios
     */
    public void inicializarVector() {
        for (int i = 0; i < v.length; i++) {
            v[i] = obtenerNumerorandomico(VALOR_MAXIMO);
        }
    }

    /**
     * método que busca el número mayor en el arreglo
     *
     * @return número mayor
     */
    public int obtenerMayor() {
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (max <= v[i]) {
                max = v[i];
            }
        }
        return (max);
    }

    /**
     * método que almacena en una cadena los elementos del vector
     *
     * @return elementos del arreglo
     */
    public String imprimirVector() {
        String str = "";
        for (int i = 0; i < v.length; i++) {
            str += " " + v[i];
//System.out.print(v[i]+" ");
        }
        return str;
    }

    /**
     * método de burbuja
     */
    public void ordenarVector() {
        int temp = 0;
//se obtiene el tamaño del vector
        int n = v.length;
//ciclos para el ordenamiento del vector
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (v[j] > v[j + 1]) {
                    temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    /**
     * metodo que retorna un valor aleatorio
     *
     * @param x
     * @return número aleatorio
     */
    public int obtenerNumerorandomico(int x) {
//clase que genera un objeto para los numeros aleatorios
        Random rnd = new Random();
        int aleatorio = rnd.nextInt(x);
        return aleatorio;
    }

    /**
     * método de búsqueda secuencial
     *
     * @param n
     * @return
     */
    public boolean obtenerBusquedaLineal(int n) {
        boolean encontro = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                encontro = true;
                break;
            }
        }
        return encontro;
    }

    /**
     * método de búsqueda secuencial
     *
     * @param n
     * @return un entero
     */
    public int buscarLineamente(int valor) {
        int i = 0;
        while (i < v.length && v[i] != valor) {
            i++;
        }
        if (i < v.length) {
            return i + 1;
        } else {
            return -1;
        }
    }

    /**
     * método de búsqueda binaria
     *
     * @param n
     * @return true o false
     */
    public boolean obtenerBusquedaBinaria(int n) {
        ordenarVector();
        boolean sw = false;
        int fin = v.length - 1;
        int inicio = 0;
        int centro = (fin + inicio) / 2;;
        while (inicio <= fin && v[centro] != n) {
            if (n < v[centro]) {
                fin = centro - 1;
            } else {
                inicio = centro + 1;
            }
            centro = (fin + inicio) / 2;
        }
        if (n == v[centro]) {
            sw = true;
        } else {
            sw = false;
        }
        return sw;
    }
}