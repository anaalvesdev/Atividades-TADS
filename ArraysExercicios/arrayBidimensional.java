import java.util.Random;
import java.util.Scanner;

//array bidimensional, como fazer para percorrer
public class arrayBidimensional {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner leia = new Scanner(System.in);
        double[][][] notas = new double[5][8][4];
        // se sao bidimensional precisa de dois for, for para preencher o array com as
        // notas
        for (int s = 0; s < notas.length; s++){
        for (int i = 0; i < notas[s].length; i++) { // posso usar leght se nao quiser sempre mudar o numero, // quando a pessoa digitar ao inves de trocar manualmente o lenght  // melhora (lenght/comprimento)
            for (int j = 0; j < notas[i][s].lenght; j++) {
                System.out.printf("Digite a nota %d do aluno %d%n", (j + 1), (i + 1));
                notas[s][i][j] = rand.nextDouble(0, 10);

            }
        }
        }
        // for para exibir/calcular as notas e a medias
        for(int s=0;s<notas.length;s++){
            System.out.println("Sala" + (s+1));
        }
        for (int i = 0; i < notas[i].length; i++) {
            System.out.printf("Aluno %d da sala %d", (i + 1), (s + 1));
            double media = 0;
            // for para passar as notad
            for (int j = 0; j < notas[i].length; j++) {
                media += notas[s][i][j];
                System.out.printf("|%4.1f", notas[i][j]);
            }
            media /= notas[s][i].length;
            System.out.printf("|%4.1f%n", media);
        }
    }
}
