package main;

import javax.swing.JOptionPane;

/**
 *
 * @author oo
 */
public class PruebaMatrizProceso {

    private String[] menuOpciones;
    private String opcion;
    private MatrizProceso matriz;

    public PruebaMatrizProceso() {
        this.matriz = new MatrizProceso();
        matriz.MatrizProceso(5, 5);

        this.menuOpciones = new String[]{
            "\n Menú Búsqueda Secuencial y Binaria\n"
            + "\n1. Ingresar Datos"
            + "\n2. Imprimir Matriz"
            + "\n3. Suma Elementos de la Matriz"
            + "\n4. Suma Diagonal Principal "
            + "\n5. Elementos de la Diagonal Secundaria "
            + "\n6. Salir"};
        this.opcion = "";
    }

    public void leerMenu() {
        int numero = 0;
        String opc = "";
        do {
            opc = JOptionPane.showInputDialog(null, menuOpciones);
            numero = Integer.parseInt(opc);
            switch (numero) {
                case 1:
                    matriz.llenarMatriz();
                    break;
                case 2:
                    imprimirArreglo(matriz);
                    break;
                case 3:
                    imprimirSumaMatriz(matriz);
                    break;
                case 4:
                    imprimirSumaDiagonal(matriz);
                    break;
                case 5:

                    break;
            }
        } while (numero != 6);
        System.exit(0);
    }

    public void imprimirArreglo(MatrizProceso p) {
        JOptionPane.showMessageDialog(null, "Los elementos de la Matriz son: \n" + p.imprimirMatriz());
    }

    private void crearMatriz() {
    }

    private void imprimirSumaMatriz(MatrizProceso p) {
        JOptionPane.showMessageDialog(null, "La Suma de los elementos de la matriz es: \n" + p.sumarElementos());
    }

    private void imprimirSumaDiagonal(MatrizProceso p) {
        JOptionPane.showMessageDialog(null, "La Suma de los elementos en diagonal de la matriz es: \n" + p.sumarDiagonal());
    }

    private void imprimirElementoDiagonal() {
    }

    public static void main(String[] args) {
        PruebaMatrizProceso o = new PruebaMatrizProceso();
        o.leerMenu();
    }
}
