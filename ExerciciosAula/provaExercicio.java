import java.util.Random;
import java.util.Scanner;

public class provaExercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        String titulo;
        int escolha;
        int qtd;
        int[] livros = new int[10];
        int qtdPag = 0;
        int qtdEmprestimos = 0;
        int qtdDevolucoes = 0;
        int qtdMenosEmprestados;
        double mediaEmprestimos, Estatísticas;
        int ano = 0;

        /*
         * A quantidade mínima de páginas é 50 e a máxima é 1500
         * • As quantidades de empréstimos e devoluções não podem ser negativas
         * • A quantidade de devoluções não pode ser maior que a quantidade de
         * empréstimos
         * • O ano de publicação deve estar entre 1950 e 2025
         */
        // String titulo = new String[10];

        System.out.println("Informe a quantidade de livros que deseja cadastrar:  (Informe de 1 a 10)");
        qtd = leia.nextInt();
        if (qtd < 0 || qtd > 10) {
            System.out.println("Quantidade errada,não é possível continuar");
        }

        /*
         * A quantidade mínima de páginas é 50 e a máxima é 1500
         * As quantidades de empréstimos e devoluções não podem ser negativas
         * A quantidade de devoluções não pode ser maior que a quantidade de empréstimos
         * O ano de publicação deve estar entre 1950 e 2025
         */

        if (qtdPag < 50 && qtdPag > 1500) {
            System.out.println("Informe uma quantidade valida de paginas: ");
        } else if (qtdEmprestimos < 0 && qtdDevolucoes < 0) {
            System.out.println("Informe um número positivo: ");
        } else if (qtdDevolucoes > qtdEmprestimos) {
            System.out.println("Quantidade de Devoluções não podem ser maior que a quantidade de emprestimos");
        }

        while (qtd > 0 || qtd < 10) {
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
                    System.out.println("Informe o Título");
                    titulo = leia.next();
                    System.out.println("Informe o Ano de publicação");
                    ano = leia.nextInt();
                    System.out.println("Informe a quantidade de páginas");
                    qtdPag = leia.nextInt();
                    System.out.println("Informe a quantidade de empréstimos realizados");
                    qtdEmprestimos = leia.nextInt();
                    System.out.println("Informe a quantidade de devoluções realizadas");
                    qtdDevolucoes = leia.nextInt();
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
