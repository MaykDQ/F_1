package main;

public class OperacionCadena {

    /**
     * metodo que retorna la longitud de la cadena
     *
     * @param str
     * @return numero de caracteres de la cadena
     */
    public int obtenerlongitudCadena(String str) {
        return str.length();
    }

    /**
     * convierte la cadena a mayúsculas
     *
     * @param str
     * @return cadena en mayúsculas
     */
    public String convertirMayusculas(String str) {
        return str.toUpperCase();
    }

    /**
     * Metodo que convierte la cadena a letras minúsculas
     *
     * @param str
     * @return cadena en minúsculas
     */
    public String convertirMinusculas(String str) {
        return str.toLowerCase();
    }

    /**
     * Impresión de la cadena tamando los caracteres del String
     *
     * @param str
     */
    public void imprimirCaracteres(String str) {
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            System.out.print(" " + c);
        }
        System.out.println(" ");
    }
}