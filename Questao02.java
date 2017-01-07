package cap05;
import java.util.Random;
import javax.swing.JOptionPane;
public class Questao02 {
    public static void main(String[] args) {
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro","Dezembro"};
        Random gerador = new Random();
        int posicao = gerador.nextInt(11);
        JOptionPane.showMessageDialog(null, mes[posicao]);
    }
}
