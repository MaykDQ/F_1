package main;

import javax.swing.JOptionPane;

public class PruebaBusqueda {

    private String[] menuOpciones;
    private String opcion;
    private Busqueda operacionVector;

    /*
     ** constructor de la clase PruebaBusqueda
     */
    public PruebaBusqueda() {
        this.operacionVector = new Busqueda();
        this.menuOpciones = new String[]{
            "\n Menú Búsqueda Secuencial y Binaria\n"
            + "\n1. Crear Vector"
            + "\n2. Imprimir Vector"
            + "\n3. Imprimir Mayor"
            + "\n4. Ordenar "
            + "\n5. Busqueda Secuencial 1"
            + "\n6. Busqueda Secuencial 2"
            + "\n7 Busqueda Binaria"
            + "\n8. Salir"
        };
        this.opcion = "";
    }

    /**
     * Metodo que tiene las opciones del menu de la lista
     */
    public void leerMenu() {
        int numero = 0;
        String opc = "";
        do {
            opc = JOptionPane.showInputDialog(null, menuOpciones);
            numero = Integer.parseInt(opc);
            switch (numero) {
                case 1:
                    operacionVector.inicializarVector();
                    break;
                case 2:
                    imprimirArreglo();
                    break;
                case 3:
                    imprimirNumeroMayor();
                    break;
                case 4:
                    operacionVector.ordenarVector();
                    imprimirArreglo();
                    break;
                case 5:
                    buscar();
                    break;
                case 6:
                    obtenerConsultaLineal();
                    break;
                case 7:
                    obtenerConsultaBinaria();
                    break;
            }
        } while (numero != 8);
        System.exit(0);
    }

    /**
     * método que imprime los elementos del vector
     */
    public void imprimirArreglo() {
        String arreglo = "";
        arreglo = operacionVector.imprimirVector();
        JOptionPane.showMessageDialog(null, arreglo);
    }

    /**
     * método para accesar búsqueda secuencial
     */
    public void obtenerConsultaLineal() {
        int numero = 0;
        String arreglo = "";
        String dato = "";
        arreglo = operacionVector.imprimirVector();
        dato = JOptionPane.showInputDialog("Digite el Numero a Buscar");
        numero = Integer.parseInt(dato);
        if (operacionVector.obtenerBusquedaLineal(numero)) {
            arreglo += "\nValor Encontrado";
        } else {
            arreglo += "\nValor No Hallado";
        }
        JOptionPane.showMessageDialog(null, arreglo);
    }

    /**
     * método de búsqueda secuencial
     *
     */
    public void buscar() {
        int numero = 0;
        String arreglo = "";
        String dato = "";
        arreglo = operacionVector.imprimirVector();
        dato = JOptionPane.showInputDialog("Digite el Numero a Buscar");
        numero = Integer.parseInt(dato);
        if (operacionVector.buscarLineamente(numero) == -1) {
            arreglo += "\nValor NO Encontrado";
        } else {
            arreglo += "\nValor Hallado";
        }
        JOptionPane.showMessageDialog(null, arreglo);
    }

    /**
     * método para accesar búsqueda binaria
     */
    public void obtenerConsultaBinaria() {
        int numero = 0;
        String arreglo = "";
        String dato = "";
        arreglo = operacionVector.imprimirVector();
        dato = JOptionPane.showInputDialog("Digite el Numero a Buscar");
        numero = Integer.parseInt(dato);
        if (operacionVector.obtenerBusquedaBinaria(numero)) {
            arreglo += "\nValor Encontrado";
        } else {
            arreglo += "\nValor No Hallado";
        }
        JOptionPane.showMessageDialog(null, arreglo);
    }

    public void imprimirNumeroMayor() {
        int numero = 0;
        String arreglo = "";
        arreglo = operacionVector.imprimirVector();
        numero = operacionVector.obtenerMayor();
        arreglo += "\nEl numero mayor es " + numero;
        JOptionPane.showMessageDialog(null, arreglo);
    }

    /**
     * método principal de la aplicación
     *
     * @param args
     */
    public static void main(String[] args) {
        PruebaBusqueda pb = new PruebaBusqueda();
        pb.leerMenu();
    }
}