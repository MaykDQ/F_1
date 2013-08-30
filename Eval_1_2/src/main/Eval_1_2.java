package main;

import javax.swing.JOptionPane;

/**
 *
 * @author oo
 */
public class Eval_1_2 {

    private int[] vector;
    final int size = 10;

    public Eval_1_2() {
        this.vector = new int[size];
    }

    public void rellenar() {
        for (int i = 0; i < size; i++) {
            this.vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero a almacenar"));
        }

    }

    public void imprimirVector() {
        String arreglo = "";
        for (int i = 0; i < size; i++) {
            arreglo = arreglo + this.vector[i] + ",";
        }
        JOptionPane.showMessageDialog(null, arreglo);
    }

    public void media() {
        int res = this.vector[0] + this.vector[1];
        for (int i = 2; i < size; i++) {
            res = res + this.vector[i];
        }
        res = res / size;
        JOptionPane.showMessageDialog(null, res);
    }

    public static void main(String[] args) {
        Eval_1_2 t = new Eval_1_2();
        t.rellenar();
        t.imprimirVector();
        t.media();

    }
}
