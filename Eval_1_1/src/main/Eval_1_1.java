package main;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author oo
 */
public class Eval_1_1 {

    private int[] vector;
    final int size = 15;

    public Eval_1_1 () {
        this.vector = new int[size];
    }

    public void rellenar() {
        //Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            this.vector[i] = 0;
            // this.vector[i] = rnd.nextInt(20);
        }

    }

    public void imprimirVector() {
        String arreglo = "";
        for (int i = 0; i < size; i++) {
            arreglo = arreglo + this.vector[i] + ",";
        }
        JOptionPane.showMessageDialog(null, arreglo);

    }

    public static void main(String[] args) {
        Eval_1_1 t = new Eval_1_1();
        t.rellenar();
        t.imprimirVector();

    }
}
