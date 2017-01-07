
package cap05;
import javax.swing.JOptionPane;
public class Questao05 {
    public static void main(String[] args) {
        String[] vagasEstacionamento = new String[10];
        int opcao, numeroVaga;
        String placaCarro;
        for (int i = 0; i < vagasEstacionamento.length; i++){
            vagasEstacionamento[i] = "Livre";
        }
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Entrada\n2-Saída\n3-Listar Situação Atual\n4-Encerrar Programa"));
            String status = "";
            switch(opcao){
                case 1:
                    numeroVaga = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da vaga (De 1 a 10):"));
                    placaCarro = JOptionPane.showInputDialog("Informe a placa do Carro:");
                    vagasEstacionamento[numeroVaga-1] = placaCarro;
                    break;
                case 2:
                    numeroVaga = Integer.parseInt(JOptionPane.showInputDialog("Número da vaga a ser liberada (De 1 a 10):"));
                    vagasEstacionamento[numeroVaga-1] = "Livre";
                    break;
                case 3:
                    for(int i = 0; i < vagasEstacionamento.length; i++){
                        status += "Vaga "+ (i+1) +": " + vagasEstacionamento[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, status);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Volte Sempre!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informe uma opção válida");
                    break;
            }
        }while(opcao!=4);
    }
}
