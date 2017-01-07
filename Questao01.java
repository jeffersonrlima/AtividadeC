
package cap05;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;
public class Questao01 {
    public static void main(String[] args) {
        float[] notas = new float[5];
        float somatorio = 0;
        float media;
        String ordemDecrescente = "";
        for (int i = 0; i < notas.length; i++) {
           notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota "+ (i+1) +": "));
        }
        for (int i = 0; i < notas.length; i++) {
            somatorio += notas[i];
        }
        Arrays.sort(notas);
        media = somatorio/5;
        
        JOptionPane.showMessageDialog(null, media);
        for (int i = 4; i >= 0; i--) {
            ordemDecrescente += String.valueOf(notas[i])+ ", ";
        }
        JOptionPane.showMessageDialog(null, ordemDecrescente);
    }
}
