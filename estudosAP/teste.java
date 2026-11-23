import java.util.Random;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        int escolha = 0;
        int qtd;
        String busca;

        // Validar a quantidade de livros
        // (na prova troque 1 e 10 por 1000 e 5000)
        System.out.println("Informe a quantidade de livros que deseja cadastrar:  (Informe de 1000 a 5000)");
        qtd = leia.nextInt();
        while (qtd < 1000 || qtd > 5000) {
            System.out.println("Quantidade errada,não é possível continuar");
            qtd = leia.nextInt();
        }

        // arrays para armazenar os dados dos livros
        // a partir da quantidade digitada de quantos livros serao cadastrados que sera armazenado em cada array
        String[] titulo = new String[qtd];
        int[] ano = new int[qtd];
        int[] qtdPag = new int[qtd];
        int[] qtdEmprestimos = new int[qtd];
        int[] qtdDevolucoes = new int[qtd];

        // random para gerar numeros aleatorios com base nas especificações,para limitar o randow precisa usar essa formula rand.nextInt(máximo - mínimo + 1) + mínimo
        for (int i = 0; i < qtd; i++) {
            titulo[i] = "Livro " + (i + 1); // titulo e diferente pq é texto
            ano[i] = rand.nextInt(2025 - 1950 + 1) + 1950; // 1950 a 2025
            qtdPag[i] = rand.nextInt(1500 - 50 +1) + 50; // 50 a 1500
            qtdEmprestimos[i] = rand.nextInt(1001); // 0 a 1000
            qtdDevolucoes[i] = rand.nextInt(qtdEmprestimos[i] + 1); // 0 até qtdEmprestimos aqui nao precisa fazer a soma pq randow inicia no zero
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
                    listarLivros(titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
                    break;
                case 2:
                    livroMaisEmprestado(titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
                    break;
                case 3:
                    livroMenosEmprestado(titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
                    break;
                case 4:
                    System.out.println("Média de empréstimos: " + calcularMedia(qtdEmprestimos));
                    break;
                case 5:
                    livrosAcimaDaMedia(titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
                    break;
                case 6:
                    estatisticas(ano, qtdEmprestimos, qtdDevolucoes);
                    break;
                case 7:
                    System.out.println("Informe o nome do livro que deseja buscar: ");
                    leia.nextLine(); // limpa o Enter que sobrou do nextInt()
                    busca = leia.nextLine();
                    buscarLivro(busca, titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
                    break;
                case 8:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha de 1 a 8.");
                    break;
            }
        }
        leia.close();
    }

    // mostra os dados de UM livro (posição i dos arrays)
    public static void exibirLivro(int i, String[] titulo, int[] ano, int[] qtdPag,
            int[] qtdEmprestimos, int[] qtdDevolucoes) {
        System.out.println("Título: " + titulo[i]);
        System.out.println("Ano de publicação: " + ano[i]);
        System.out.println("Páginas: " + qtdPag[i]);
        System.out.println("Empréstimos: " + qtdEmprestimos[i]);
        System.out.println("Devoluções: " + qtdDevolucoes[i]);
        System.out.println("Empréstimos pendentes: " + (qtdEmprestimos[i] - qtdDevolucoes[i]));
        System.out.println("---------------------------");
    }

    // 1. Listar livros
    public static void listarLivros(String[] titulo, int[] ano, int[] qtdPag,
            int[] qtdEmprestimos, int[] qtdDevolucoes) {
        for (int i = 0; i < titulo.length; i++) {
            exibirLivro(i, titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
        }
    }

    // 2. Livro(s) mais emprestado(s)
    public static void livroMaisEmprestado(String[] titulo, int[] ano, int[] qtdPag,
            int[] qtdEmprestimos, int[] qtdDevolucoes) {
        int maior = qtdEmprestimos[0]; // começa assumindo que o primeiro é o maior
        for (int i = 1; i < qtdEmprestimos.length; i++) {
            if (qtdEmprestimos[i] > maior) {
                maior = qtdEmprestimos[i];
            }
        }
        System.out.println("Maior quantidade de empréstimos: " + maior);
        for (int i = 0; i < qtdEmprestimos.length; i++) { // mostra todos que empatam
            if (qtdEmprestimos[i] == maior) {
                exibirLivro(i, titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
            }
        }
    }

    // 3. Livro(s) menos emprestado(s)
    public static void livroMenosEmprestado(String[] titulo, int[] ano, int[] qtdPag,
            int[] qtdEmprestimos, int[] qtdDevolucoes) {
        int menor = qtdEmprestimos[0];
        for (int i = 1; i < qtdEmprestimos.length; i++) {
            if (qtdEmprestimos[i] < menor) {
                menor = qtdEmprestimos[i];
            }
        }
        System.out.println("Menor quantidade de empréstimos: " + menor);
        for (int i = 0; i < qtdEmprestimos.length; i++) {
            if (qtdEmprestimos[i] == menor) {
                exibirLivro(i, titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
            }
        }
    }

    // 4. Média de empréstimos (retorna o valor para a opção 5 reaproveitar)
    public static double calcularMedia(int[] qtdEmprestimos) {
        int soma = 0;
        for (int i = 0; i < qtdEmprestimos.length; i++) {
            soma += qtdEmprestimos[i];
        }
        return (double) soma / qtdEmprestimos.length;
    }

    // 5. Livros acima da média
    public static void livrosAcimaDaMedia(String[] titulo, int[] ano, int[] qtdPag,
            int[] qtdEmprestimos, int[] qtdDevolucoes) {
        double media = calcularMedia(qtdEmprestimos);
        System.out.println("Média de empréstimos: " + media);
        for (int i = 0; i < qtdEmprestimos.length; i++) {
            if (qtdEmprestimos[i] > media) {
                exibirLivro(i, titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
            }
        }
    }

    // 6. Estatísticas
    public static void estatisticas(int[] ano, int[] qtdEmprestimos, int[] qtdDevolucoes) {
        int maisAntigo = ano[0];
        int maisRecente = ano[0];
        int somaAnos = 0;
        int totalEmprestimos = 0;
        int totalDevolucoes = 0;
        int contMais100 = 0;

        for (int i = 0; i < ano.length; i++) {
            if (ano[i] < maisAntigo) {
                maisAntigo = ano[i];
            }
            if (ano[i] > maisRecente) {
                maisRecente = ano[i];
            }
            somaAnos += ano[i];
            totalEmprestimos += qtdEmprestimos[i];
            totalDevolucoes += qtdDevolucoes[i];
            if (qtdEmprestimos[i] > 100) {
                contMais100++;
            }
        }

        double mediaAnos = (double) somaAnos / ano.length;
        double percentual = (double) contMais100 * 100 / ano.length;

        System.out.println("Ano mais antigo: " + maisAntigo);
        System.out.println("Ano mais recente: " + maisRecente);
        System.out.println("Média dos anos de publicação: " + mediaAnos);
        System.out.println("Total de empréstimos: " + totalEmprestimos);
        System.out.println("Total de devoluções: " + totalDevolucoes);
        System.out.println("Livros com mais de 100 empréstimos: " + percentual + "%");
    }

    // 7. Buscar livro pelo título
    public static void buscarLivro(String busca, String[] titulo, int[] ano, int[] qtdPag,
            int[] qtdEmprestimos, int[] qtdDevolucoes) {
        boolean achou = false;
        for (int i = 0; i < titulo.length; i++) {
            if (titulo[i].equalsIgnoreCase(busca)) {
                exibirLivro(i, titulo, ano, qtdPag, qtdEmprestimos, qtdDevolucoes);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Livro não localizado.");
        }
    }
}

    
