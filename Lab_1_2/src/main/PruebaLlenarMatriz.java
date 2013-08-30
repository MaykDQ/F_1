package main;
import javax.swing.JOptionPane;

/**
 * clase que prueba las formas de cargar elementos a una matriz. de números
 * enteros
 *
 * @author Miguel Hernández
 * 
*/
public class PruebaLlenarMatriz {
    //definicion del objeto matriz de la clases ProcesoMatriz
    private LlenarMatriz matriz;
    private String[] menuOpciones;
    private String opcion;

    public PruebaLlenarMatriz() {
        this.matriz = new LlenarMatriz();
        
        this.menuOpciones = new String[]{
            "\n Menú Búsqueda Secuencial y Binaria\n"
            + "\n1. Ingresar Datos"
            + "\n2. Imprimir Matriz"
            + "\n3. Incializar Matriz con Contador"
            + "\n4. Incializar Matriz Números Aleatorios "
            + "\n5. Buscar Elemento en la Matriz "
            + "\n6. Salir"};
        this.opcion = "";
    }

    /**
     * Metodo que tiene las opciones del menu del vector
     */
    public void leerMenu() {
        int numero = 0;
        String opc = "";
        do {
            opc = JOptionPane.showInputDialog(null, menuOpciones);
            numero = Integer.parseInt(opc);
            switch (numero) {
                case 1:
                    matriz.inicializarTeclado();
                    imprimirArreglo();
                    break;
                case 2:
                    imprimirArreglo();
                    break;
                case 3:
                    matriz.inicializarVariable();
                    imprimirArreglo();
                    break;
                case 4:
                    matriz.inicializarAleatoriamente();
                    imprimirArreglo();
                    break;
                case 5:
                    buscar();//obtenerConsultaLineal();
                    break;
            }
        } while (numero != 6);
        System.exit(0);
    }

    /**
     * método que imprime los elementos del vector
     */
    public void imprimirArreglo() {
        String arreglo = "";
        arreglo = matriz.imprimirMatriz();
        JOptionPane.showMessageDialog(null, arreglo);
    }

    /**
     * método de búsqueda de un elemento en la matriz
     */
    public void buscar() {
        int numero = 0;
        String arreglo = "";
        String dato = "";
        arreglo = matriz.imprimirMatriz();
        dato = JOptionPane.showInputDialog("Digite el Numero a Buscar");
        numero = Integer.parseInt(dato);
        if (matriz.buscarElemento(numero)) {
            arreglo += "\n " + numero + " Valor Encontrado";
        } else {
            arreglo += "\n" + numero + " Valor No Hallado";
        }
        JOptionPane.showMessageDialog(null, arreglo);
    }

    /**
     * método principal de la aplicación
     *
     * @param args
     */
    public static void main(String[] args) {

        PruebaLlenarMatriz pb = new PruebaLlenarMatriz();
        pb.leerMenu();
    }
}