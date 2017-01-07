
package cap05;
import java.util.Random;
public class Questao04 {
    public static void main(String[] args) {
        int[] par = new int[10];
        int[] impar = new int[10];
        int contadorPar = 0;
        int contadorImpar = 0;    
        while(contadorPar < 10){
            Random numero = new Random();
            int valor = numero.nextInt(20);
            if(valor % 2 == 0 && valor != 0){
                par[contadorPar] = valor;
                contadorPar++;
            }
        }
        while(contadorImpar < 10){
            Random numero = new Random();
            int valor = numero.nextInt(20);
            if(valor % 2 == 1 && valor != 0){
                impar[contadorImpar] = valor;
                contadorImpar++;
            }
        }
        System.out.println("== Pares ==");
        for(int i = 0; i < par.length; i++){
            System.out.print(par[i] + " ");
        }
        System.out.println("\n== Impares ==");
        for(int i = 0; i < impar.length; i++){
            System.out.print(impar[i] + " ");
        }
    }
}
