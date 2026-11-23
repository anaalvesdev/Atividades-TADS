import java.util.Random;
import java.util.Scanner;

public class avaliaçaoDois {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        int qtd;
        String busca = "";
        // ENTRADA
        System.out.println("Informe a quantidade de livros que deseja cadastrar:  (Informe de 1000 a 5000)");
        qtd = leia.nextInt();
        while (qtd < 1000 || qtd > 5000) {
            System.out.println("Quantidade errada, tente novamente (Informe de 1000 a 5000)");
            qtd = leia.nextInt();
        }

        String[] nome = new String[qtd];
        int[] idade = new int[qtd];
        int[] pontuacao = new int[qtd];
        int[] qtdPartidas = new int[qtd];
        int[] qtdVitorias = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            nome[i] = "Nome " + (i + 1);
            pontuacao[i] = rand.nextInt(10001); // A pontuação mínima é 0 e a máxima é 10000
            qtdPartidas[i] = rand.nextInt(qtd); // As quantidades de partidas e vitórias não podem ser
                                                // negativas A quantidade de vitorias
            qtdVitorias[i] = rand.nextInt(qtd);
            idade[i] = rand.nextInt(70 - 12 + 1) + 12;// A idade mínima dos jogadores é 12 anos e a idade máxima é 70

        }

        // MENU - ESCOLHAS

        int escolha = 0;
        while (escolha != 8) {
            System.out.println("Programa Iniciado");
            System.out.println("1 - Listar jogadores");
            System.out.println("2 - Melhor jogador");
            System.out.println("3 - Pior jogador");
            System.out.println("4 - Média de pontuação");
            System.out.println("5 - Jogadores acima da média");
            System.out.println("6 - Estatísticas");
            System.out.println("7 - Buscar jogador pelo nome");
            System.out.println("8 - Encerrar");
            escolha = leia.nextInt();
            switch (escolha) {
                case 1:
                    listar(nome, idade, pontuacao, qtdPartidas, qtdVitorias);
                    break;
                case 2:
                    melhorJogador(nome, idade, pontuacao, qtdPartidas, qtdVitorias);
                    // Melhor jogador: exibir o(s) jogador(es) com maior pontuação
                    break;
                case 3:
                    piorJogador(nome, idade, pontuacao, qtdPartidas, qtdVitorias);
                    // Pior jogador: exibir o(s) jogador(es) com menor pontuação
                    break;
                case 4:
                    calcularMedia(pontuacao);
                    // Média de pontuação: exibir a média das pontuações.
                    break;
                case 5:
                    acimaMedia(nome, idade, pontuacao, qtdPartidas, null, pontuacao);
                    // Jogadores acima da média: mostrar apenas os jogadores com pontuação acima da
                    // média.
                    break;
                case 6:
                    estatisticas(nome, idade, pontuacao, qtdPartidas, qtdVitorias, pontuacao);
                    break;
                case 7:
                    System.out.println("Informe o nome do jogador que você deseja:  (Ex..Jogador1,2,3....)");
                    busca = leia.next();
            buscarNome(qtd, nome, idade, pontuacao, qtdPartidas, qtdVitorias, busca);
                    // Buscar jogador: solicitar o nome do jogador e buscá-lo, exibindo suas
                    // informações. Caso o jogador não exista, informar ao usuário.
                    break;
                    case 8: System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha de 1 a 8.");
                    break;
            }
        }

    }

    // PROCESSAMENTO - METODOS
    // metodos
    public static void exibirJogador(int i,int qtd, String nome[], int idade[], int idade1[], int pontuaçao[], int qtdPartida[], int qtdVitorias[]) {
        System.out.println("Nome: " + nome[i]); //mostrar um jogador
        System.out.println("Idade: " + idade1[i]);
        System.out.println("Pontuação: " + pontuaçao[i]);
        System.out.println("Quantidade Partidas: " + qtdPartida[i]);
        System.out.println("Quantidade de Vitorias: " + qtdVitorias[i]);
        System.out.println("---------------------------");

    }

    public static void listar(String[] nome, int[] idade, int[] pontuaçao, int[] qtdPartidas, int[] qtdVitorias) {
        for (int i = 0; i < nome.length; i++) {
exibirJogador(i, i, nome, idade, idade, pontuaçao, qtdPartidas, qtdVitorias);                                                                                       // um somente com os requisitos
                                                                                       // do jogador
        }
    }

    public static void melhorJogador(String[] nome, int[] idade, int[] pontuaçao, int[] qtdPartidas,
            int[] qtdVitorias) {
        // com maior pontuação
        int maior = pontuaçao[0]; // começa assumindo que o primeiro é o maior
        for (int i = 1; i < pontuaçao.length; i++) {
            if (pontuaçao[i] >= maior) {
                maior = pontuaçao[i];
            }
            System.out.println("Maior jogador: " + maior);
        }
    }

    public static void piorJogador(String[] nome, int[] idade, int[] pontuaçao, int[] qtdPartidas, int[] qtdVitorias) {
        // com maior pontuação
        int menor = pontuaçao[0]; // começa assumindo que o primeiro é o maior
        for (int i = 0; i < pontuaçao.length; i++) {
            if (pontuaçao[i] < menor) {
                menor = pontuaçao[i];
            }
            System.out.println("Menor Jogador: " + menor);
        }
    }

    public static double calcularMedia(int[] pontuacao) {
        double media = 0;
        for (int i = 0; i < pontuacao.length; i++) {
            media += pontuacao[i];
            System.out.println("Média das pontuações: " + media);
        }
        return (double) media / pontuacao.length;
    }

    public static void acimaMedia(String[] nome, int[] idade, int[] pontuaçao, int[] qtdPartidas, int[] qtdVitorias[],
            int[] pontuacao) {
        double media = calcularMedia(pontuacao);
        System.out.println("Média de pontuação: " + media);
        for (int i = 0; i < pontuacao.length; i++) {
            if (pontuacao[i] > media) {
                System.out.println("Jogadores com pontuação maior que média:  " + media);
            }
        }
    }
    public static void estatisticas(String[] nome, int[] idade, int[] pontuaçao, int[] qtdPartidas, int[] qtdVitorias,
            int[] pontuacao) {
        int maiorIdade = idade[0];
        int menorIdade = idade[0];
        double soma = 0;
        int totalVitorias = 0;
        int totalDerrotas = 0;

        for (int i = 0; i < pontuacao.length; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
            }
            if (idade[i] < menorIdade) {
                menorIdade = idade[i];
            }
            if (qtdVitorias[i] < qtdPartidas[i]) {
                totalDerrotas = qtdPartidas[i] - qtdVitorias[i];
            }

            totalVitorias += qtdPartidas[i];
            double mediaIdade = maiorIdade / menorIdade;
            if (pontuacao[i] >= 7000) {
                soma++;
            }
            double percentual = soma * 100 / pontuacao.length;
            System.out.println("---------------------------");
            System.out.println("Jogadores com maior Idade: " + maiorIdade);
            System.out.println("Jogadores com menor Idade: " + menorIdade);
            System.out.println("Média de idade: " + mediaIdade);
            System.out.println("Total Vitórias: " + totalVitorias);
            System.out.println("Total Derrotas: " + totalDerrotas);
            System.out.println("Percentual Jogadores: " + percentual);
            System.out.println("---------------------------");

        }
    }

    public static void buscarNome(int qtd, String nome[], int idade[], int pontuaçao[], int qtdPartida[],
            int qtdVitorias[],String busca) {
        boolean achou = false;

        for (int i = 0; i < nome.length; i++) {
            if (nome[i].equalsIgnoreCase(busca)) {
                exibirJogador(i, qtd, nome, idade, idade, pontuaçao, qtdPartida, qtdVitorias);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Jogador não localizado!");
        }
    }

}
