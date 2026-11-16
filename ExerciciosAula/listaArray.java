import java.util.Random;
import java.util.Scanner;

public class listaArray {
    // atividade grau de dificuldade de prova
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        int quantidade;
        int livros;
        String titulo;
        /*
         * String[] palavras; // variavel do array
         * System.out.println("Quantas palavras serão digitadas?");
         * qtd = leia.nextInt();
         * palavras = new String[qtd];
         */
        System.out.println("Qual quantidade de livros será cadastrada?(Só pode ser entre 1000 e 5000)");
        quantidade = leia.nextInt();
        if (quantidade < 1000 || quantidade > 5000 || quantidade <= 0) {
            System.out.println("Quantidade errada,não é possível continuar");
        } else {
            System.out.println("Programa Iniciado");
        }
       // titulo = new String[quantidade];
       for(int i =0; i > quantidade; i++){
        System.out.println("Informe o nome do livro: ");
        titulo = leia.nextLine();
       } 
       
    }
}
