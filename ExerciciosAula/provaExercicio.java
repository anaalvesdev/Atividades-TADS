import java.util.Random;
import java.util.Scanner;

public class provaExercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        int escolha = 0;
        int qtd;
        // Validar a quantidade de livros
        System.out.println("Informe a quantidade de livros que deseja cadastrar:  (Informe de 1 a 10)");
        qtd = leia.nextInt();
        while (qtd < 0 || qtd > 10) {
            System.out.println("Quantidade errada,não é possível continuar");
            qtd = leia.nextInt();
        }

        // arrays para armazenar os dados dos livros, o valor que vai ser recebido do
        // usuario fica no segundo colchetes
        String[] titulo = new String[qtd];
        int[] ano = new int[qtd];
        int[] qtdPag = new int[qtd];
        int[] qtdEmprestimos = new int[qtd];
        int[] qtdDevolucoes = new int[qtd];
        //int[] livros = new int[qtd]; //esse array e onde ira ficar tudo
        /*
         * A quantidade mínima de páginas é 50 e a máxima é 1500
         * • As quantidades de empréstimos e devoluções não podem ser negativas
         * • A quantidade de devoluções não pode ser maior que a quantidade de
         * empréstimos
         * • O ano de publicação deve estar entre 1950 e 2025
         */
        for (int i = 0; i < qtd; i++) { //randow para gerar numeros aleatorios com base nas especificações acima
            titulo[i] = "Livro " + (i + 1); //com titulo e diferente pq é texto
            ano[i] = rand.nextInt(76) + 1950;
            qtdPag[i] = rand.nextInt(1451) + 50;
            qtdEmprestimos[i] = rand.nextInt(1001);
            qtdDevolucoes[i] = rand.nextInt(qtdEmprestimos[i] + 1);
        }

        while (escolha != 8) {
            System.out.println("Programa Iniciado");
            System.out.println("1. Listar livros");

            System.out.println("2. Livro mais emprestado");

            System.out.println("3. Livro menos emprestado");

            System.out.println("4. Média de empréstimos");

            System.out.println("5. Livros acima da média de empréstimos");

            System.out.println("6. Estatísticas");

            System.out.println("7. Buscar livro pelo título");

            System.out.println("8. Encerrar");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:

                    break;

                case 2:

                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Informe o nome do livro que deseja buscar: ");
                    break;
                case 8:
                    break;
                default:
                    break;
            }

        }

    }

}
