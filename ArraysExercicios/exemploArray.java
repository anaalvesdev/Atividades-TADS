import java.util.Scanner;

public class exemploArray {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtd;
        String[] palavras; // variavel do array
        System.out.println("Quantas palavras serão digitadas?");
        qtd = leia.nextInt();
        palavras = new String[qtd]; // array so passa a existir quando colocamos new
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Digite a palavra");
            palavras[i] = leia.next();
            //exibir
            for(String s: palavras){
                System.out.println(s);
            }
        }
    }
}
