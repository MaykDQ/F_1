package main;

import javax.swing.JOptionPane;

/**
 *
 * @author oo
 */
public class Eval_1_3 {

    private int[] vector;
    final int size = 5;
    int[] data = { 3, 4, 11, 14, 1 };

    public Eval_1_3() {
        this.vector = new int[size];
    }

    public void rellenar() {
        for (int i = 0; i < size; i++) {
            this.vector[i] = this.data[i];
        }
    }

    public void procesar() {
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (vector[ i] % 2 == 0) {
                x += vector[ i];
            }
        }
        JOptionPane.showMessageDialog(null, x);
    }

    public static void main(String[] args) {
        Eval_1_3 t = new Eval_1_3();
        t.rellenar();
        t.procesar();
    }
}
