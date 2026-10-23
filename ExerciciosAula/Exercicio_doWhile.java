import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_doWhile {
   public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        int numero;
    do{
        System.out.println("Informe um numero de 1 a 100");
        numero = leia.nextInt();
        if (numero < 1 || numero > 100){
        System.err.println("Valor Invalido");

        } else {
            break;
        }
    } while (true);
       
    }
}