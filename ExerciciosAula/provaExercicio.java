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
        int[] ano = new int[10];

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
            if (escolha == 8) {
                break;
            } else if (escolha == 1) {
                System.out.println("Informe o Título");
                titulo = leia.next();
                System.out.println("Informe o Ano de publicação");

                System.out.println("Informe a quantidade de páginas");

                System.out.println("Informe a quantidade de empréstimos realizados");

                System.out.println("Informe a quantidade de devoluções realizadas");

            } else if (escolha == 2) {
                System.out.println();
            } else if (escolha == 3) {
                System.out.println("Livro menos emprestados");
            } else if (escolha == 4) {
                System.out.println("Media emprestimos");
            } else if (escolha == 5) {
                System.out.println("acima da media de emprestimos");
            } else if (escolha == 6) {
                System.out.println("estatisticas");
            } else if (escolha == 7) {
                System.out.println();
            }

        }
        if (qtdPag < 50 || qtdPag > 1500) {
            System.out.println("Quantidade de paginas não permitidas");
        } else if (qtdEmprestimos < 0 && qtdDevolucoes < 0) {
            System.out.print("Informe um número positivo!");
        } else if (qtdDevolucoes > qtdEmprestimos) {
            System.err.print("Não é possivel a quantidade de devoluções ser maior que o emprestimos: ");
        } else if()

    }

}
