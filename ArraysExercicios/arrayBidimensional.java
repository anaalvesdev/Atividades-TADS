import java.util.Random;
import java.util.Scanner;

//array bidimensional, como fazer para percorrer
public class arrayBidimensional {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner leia = new Scanner(System.in);
        double[][][] notas = new double[8][4][5];
        // se sao bidimensional precisa de dois for, for para preencher o array com as
        // notas
        for (int i = 0; i < notas[i].length; i++) { // posso usar leght se nao quiser sempre mudar o numero, sempre
                                                    // quando a pessoa digitar ao inves de trocar manualmente o lenght
                                                    // melhora (lenght/comprimento)

            for (int s = 0; s < notas[s].length; s++) {
                System.out.printf("Sua sala é %d", notas[s]);
            }
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a nota %d do aluno %d%n", (j + 1), (i + 1));
                notas[i][j] = rand.nextDouble(0, 10);

            }

        }
        // for para exibir/calcular as notas e a medias
        for (int i = 0; i < notas[i].length; i++) {
            System.out.printf("Aluno %d da sala %d", (i + 1), (s + 1));
            double media = 0;
            // for para passar as notad
            for (int j = 0; j < notas[i].length; j++) {
                media += notas[i][j];
                System.out.printf("|%4.1f", notas[i][j]);
            }
            media /= notas[i].length;
            System.out.printf("|%4.1f%n", media);
        }
    }
}
