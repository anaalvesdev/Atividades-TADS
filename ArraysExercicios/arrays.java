import java.util.Scanner;

public class arrays {
    // * int [] a = new int [4];
    // int [] [] a = new int [4] []; e possival colocar variaveis dentro do [] se
    // for bidimensional adiona os pares aos lados, se for trez usa a mesma forma
    // int [] [] [] a = new int [4] [] [] [];
    // a[1] = 5 acessar as posições do array,posicao vriavel, e resultado variavels,
    // para procurar o array e necessario usar estrutura de repetição *// */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int media = 0;
        int[] notas = new int[5];
        // for para preencher array,lenght comprimento do array
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a nota do aluno %d%n", i + 1);
            notas[i] = leia.nextInt();

        }
        // for para calcular a media e exibir a nota
       // for (int i = 0; i < notas.length; i++) {
         //   media += notas[i];
          //  System.out.printf("Nota do aluno %2d: %3d%n", i + 1, notas[i]);
       // }
        for (int nota: notas){
            media+=nota;System.out.printf("Nota do aluno: %3d%n", nota);        }
        media = media / notas.length;
        System.out.printf("a média da turma é: %d%n", media);
    }

}
