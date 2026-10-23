import java.util.Random;
import java.util.Scanner;

public class Atividade_ListaTres {
    static Scanner leia = new Scanner(System.in);
    static java.util.Random rand = new java.util.Random();

    public static void main(String[] args) {
        ex7();
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
        System.out.printf("Foram digitados %d carateres", --caractere);
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
}
public static void ex8() {
     String candidatos;
     int contador = 0;
        while (!candidatos.equalsIgnoreCase("sair")) {
            System.out.println("Informe o nome do candidato, sendo eles\n: -- Candidato 1, --Candidato 2, --Candidato 3 ou --Nulo (Digite N)\n Para encerrar a votação digite 'Sair'");
            candidatos = leia.nextLine();
            contador++;
        }
        System.out.printf("Foram digitados %d carateres"   );
}