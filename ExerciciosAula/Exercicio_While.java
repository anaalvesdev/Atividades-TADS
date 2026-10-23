import java.util.Random;
import java.util.Scanner;
//teste while
public class Exercicio_While {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        int segredo, tentativa = 0, palpite = 0;
        segredo = rand.nextInt(1, 1000);
        while (palpite != segredo ) { // testa a condição antes de repetir/iniciar o bloco
            System.out.println("Tente adivinhar o numero sorteado");
            palpite = rand.nextInt(1,10000); //fazer o computador adividnhar o numero
            tentativa++;
        }
        System.out.printf("%d tentativas(s)", tentativa);
        System.out.printf("O número era %d", segredo);
    }
        // gera um valor aleatorio entre 1 e 1000
       /*while (palpite != segredo && tentativa < 5) { // testa a condição antes de repetir/iniciar o bloco
            System.out.println("Tente adivinhar o numero sorteado");
            palpite = leia.nextInt();
            tentativa++;
        }
        System.out.printf("%d tentativas(s)", tentativa);
        System.out.printf("O número era %d", segredo);*/
    }

