import java.util.Random;
import java.util.Scanner;

public class Atividade_ListaTres {
    static Scanner leia = new Scanner(System.in);
    static java.util.Random rand = new java.util.Random();

    public static void main(String[] args) {
        ex13();
    }

    // metodo
    public static void ex1() { // Exercicios 1 da Lista 3
        // variavel para o carater digitado
        char caractere;
        // variavel para contar
        int contador = 0;
        do {
            System.out.println("Informe um caractere");
            caractere = leia.next().charAt(0);// primeira posição sempre é 0 em programação
            contador++;
        } while (caractere != '.'); // vai fazer enqunato o caractere nao for .
        System.out.printf("Foram digitados %d carateres", contador);
    }

    public static void ex2() { // Exercicios 2 da Lista 3
        String palavra;
        int vogais = 0;
        System.out.println("Informe uma palavra");
        // recebe a String e a transforma em minusculo lower cse
        palavra = leia.next().toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                {
                    vogais++;
                }
            }
        }
        System.out.printf("A palavra %s tem %d vogais", palavra, vogais);
    }

    public static void ex3() {
        int contador = 0, n;
        String palavra;
        System.out.println("Informe uma palavra");
        palavra = leia.nextLine();
        leia.nextLine();
        System.out.println("Informe a quantidade de vezes que deseja repetir a palavra");
        n = leia.nextInt();
        for (contador = 0; contador < n; contador++) { // for repete sabendo da quantidade de repetições
            System.out.printf("A palavra é %s\n", palavra);
        }
    }

    public static void ex4() {
        String contador = "";
        while (!contador.equalsIgnoreCase("sair")) {
            System.out.println("Digite algo (ou 'sair' para encerrar):");
            contador = leia.nextLine();
        } // para String se usa equals para comparar
        System.out.println("Programa Encerrado!");
    }

    public static void ex5() {
        String nome = "";
        int contador = 0;
        while (contador < 3) {
            System.out.println("Informe um nome");
            nome = leia.nextLine();
            contador = nome.length();

            if (contador == 3) {
                System.out.printf("A palavra %s tem a quantidade certa de caracteres(3) \n", nome);
            }
            if (contador != 3) {
                System.out.printf("A palavra %s tem %d caracteres \n", nome, contador);
            }
            System.out.println("Programa Encerrado! \n");
        }
    }

    public static void ex6() {
        int senha = 1234, contador = 0;

        do {
            System.out.println("Informe a senha(só pode ser numeros,nenhuma letras e nenhum caracter especial)");
            senha = leia.nextInt();
            contador++;
            if (senha == 1234) {
                System.out.println("Senha Correta");
                break;
            } else {
                System.err.println("Senha Incorreta");
            }
        } while (contador < 3);
    }

    public static void ex7() {
        int segredo, tentativa = 0, palpite = 0;
        segredo = rand.nextInt(1, 100);
        while (palpite != segredo && tentativa < 5) { // testa a condição antes de repetir/iniciar o bloco
            System.out.println("Tente adivinhar o numero sorteado");
            palpite = leia.nextInt();
            tentativa++;
        }
        System.out.printf("%d tentativas(s) foi excedido!!", tentativa);
        System.out.printf("O número era %d", segredo);

    }

    public static void ex8() {
        String voto = "";
        int voto1 = 0, voto2 = 0, voto3 = 0, nulo = 0, totalVotos = 0;
        while (!voto.equalsIgnoreCase("Sair")) {
            System.out.println(
                    "Informe o seu voto\nCandidato 1\nCandidato 2\nCandidato 3\nNulo 'N'\nou 'Sair' para encerrar a votação:");
            voto = leia.nextLine();
            if (voto.equals("1")) {
                voto1++;
            } else if (voto.equals("2")) {
                voto2++;
            } else if (voto.equals("3")) {
                voto3++;
            } else if (!voto.equalsIgnoreCase("N")) {
                nulo++;
            } else if (voto.equalsIgnoreCase("Sair")) {
                break;
            }
        }
        System.out.printf("Votos do Candidato 1: %d\n", voto1);
        System.out.printf("Votos do Candidato 2: %d\n", voto2);
        System.out.printf("Votos do Candidato 3: %d\n", voto3);
        System.out.printf("Votos Nulos: %d\n", nulo);
        System.out.printf("Total de Votos: %d\n", (voto1 + voto2 + voto3 + nulo));
    }

    public static void ex9() {
        int saldo = 1000, saque = 0;
        String opcao = "";
        while (!opcao.equalsIgnoreCase("Sair")) {
            System.out.println("Informe a operação desejada:\n1 - Saque\n2 - Saldo\n3 - Sair");
            opcao = leia.nextLine();
            if (opcao.equals("1")) {
                System.out.println("Informe o valor do saque:");
                saque = leia.nextInt();
                if (saque <= saldo && saque > 0) {
                    saldo -= saque;
                    System.out.printf("Saque realizado com sucesso! Novo saldo: %d\n", saldo);
                } else if (opcao.equals("2")) {
                    System.out.printf("Saldo atual: %d\n", saldo);
                } else if (saque < 0 || saque > saldo) {
                    {
                        System.out.println("Valor do saque inválido, você não tem saldo suficiente.");
                    }
                } else {
                    System.out.println("Programa encerrado.");
                }
            }
        }
    }

    public static void ex10() {
        String capital = "Brasilia", opção = "";

        while (!opção.equalsIgnoreCase(capital)) {
            System.out.println("Qual é a capital do Brasil?");
            opção = leia.next();
            if (opção.equalsIgnoreCase("Brasilia") || opção.equalsIgnoreCase("Brasília")) {
                System.out.println("Resposta correta!");
            } else {
                System.out.println("Resposta incorreta! Tente novamente.");
            }
        }
    }

    public static void ex11() {
        String cpf = "1234567891011", entrada = "";
        cpf.length();
        do {
            System.out.println("Informe o CPF");
            entrada = leia.next();
            if (cpf.length() == entrada.length()) {
                System.out.println("CPF correto");
                System.out.println("Programa encerrado");
                break;
            } else {
                System.out.println("CPF incorreto, quantidade de caracteres diferente, tente novamente");
            }
        } while (cpf.length() != 11);
    }

    public static void ex12() {
        String frase = "";
        int repeticoes;
        System.out.println("Informe uma frase");
        frase = leia.nextLine();
        System.out.println("Quantas vezes deseja repetir?");
        repeticoes = leia.nextInt();
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(frase);
        }
    }

    public static void ex13() {
        String palavra = "";
        int repeticoes;
        System.out.println("Informe uma palavra:");
        palavra = leia.nextLine();
        System.out.println("Quantas vezes quer ver ela sendo repetida?");
        repeticoes = leia.nextInt();
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(palavra);
        }
    }

public static void ex14(){
    
}



    public static void ex19() {
        String senha;
        do {
            System.out.println("Informe a senha:");
            senha = leia.next();
            if (senha.length() < 8) {
                System.out.println("A senha deve ter pelo menos 8 caracteres");
                continue;
            }
            boolean temNumero = false, temMaiusculo = false;
            for (int i = 0; i < senha.length(); i++) {
                char letra = senha.charAt(i);
                if (letra >= 48 && letra <= 57) {
                    temNumero = true;
                } else if (letra >= 65 && letra <= 90) {
                    temMaiusculo = true;
                }
            }
            if (temNumero && temMaiusculo) {
                break;
            } else {
                System.out.println("A senha deve ter pelo menos letra maiuscula e minuscula");
            }
            System.out.println("Senha Correta!");
        } while (true);
    }

    public static void ex23() {
        int numero = 0, qtdPares = 0, qtdImpares = 0, qtdNumeros = 0, maior = 0, menor = Integer.MAX_VALUE, media = 0;
        while (numero >= 0) {
            System.out.println("Informe um numero");
            numero = leia.nextInt();
            if (numero <= 0) {
                break;
            }
            if (numero % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            media += numero;
            qtdNumeros++;
            System.out.printf("Total de pares: %d%n", qtdPares);
        }

    }

}
