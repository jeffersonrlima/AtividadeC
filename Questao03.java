
package cap05;
import java.util.Random;
import javax.swing.JOptionPane;
public class Questao03 {
    public static void main(String[] args) {
        int[][] pixel = new int[40][40];
        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 40; j++){
                Random valor = new Random();
                int tonalidade = valor.nextInt(255);
                pixel[i][j] = tonalidade;
            }
        }
        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 40; j++){
                System.out.println("["+(i+1)+"]["+(j+1)+"]: "+pixel[i][j]);
            }
        }
    }
}
