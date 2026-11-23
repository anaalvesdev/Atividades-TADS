import java.util.Scanner;

public class ap {
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        ex6();

    }

    public static void ex1() {
        // repetir ola 5 vezes usando while
        String saudações = "Olá";
        System.out.println(saudações);
        int i = 0; // sempre precisa inicar com i = 0 e dps colocar a variavel desejada para o
                   // while repetir
        while (i < 5) {
            System.out.println(saudações);
            i++;
        }
    }

    public static void ex2() {
        // mostrar os números de 1 a 10 usando while
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }

    public static void ex3() {
        // mostrar os números de 10 a 1 usando while
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--; // para numero decresentes se usa -
        }
    }

    public static void ex4() {
        // Mostre os números pares de 2 até 20. (Dica: some 2 a cada volta.)
        for (int i = 2; i <= 20; i += 2) { // i+= 2 e para somar de dois em dois i-= 1 e contagem regressiva de 1 em 1
            System.out.println(i);
        }
    }

    public static void ex5() {
        // Calcule e mostre a soma dos números de 1 até 5. (Primeiro acumulador! A soma
        // começa em 0.)
        int i = 1;
        int soma = 0;
        while (i <= 5) {
            soma = soma + i;
            i++;
        }
        System.out.println(soma);//tem que ficar fora do laço para não dar problema
    }
public static void ex6(){
    //Igual ao anterior, mas o usuário digita o n e você soma de 1 até n. 
     int numero;
    System.out.println("Digite um número para somar de 1 até ele:");
    numero = leia.nextInt();
    int soma = 0;
    int i = 1;
    while (i <= numero) {
        soma = soma + i;//o i e oque soma o numero so e escolhhido pelo usuario
        i++;
    }
        System.out.printf("O resultado da soma com o numero %d é %d",numero,soma);//tem que ficar fora do laço para não dar problema
    }



    public static void usarArray(){
      /*   preencher um array com a entrada do usuário 
Scanner sc = new Scanner(System.in);
int[] notas = new int[5];

for (int i = 0; i < notas.length; i++) {
    System.out.print("Digite a nota " + (i + 1) + ": ");
    notas[i] = sc.nextInt();
}
    }
*/

/* somar e calcular média

int soma = 0;
for (int i = 0; i < notas.length; i++) {
    soma += notas[i];
}
double media = (double) soma / notas.length;
System.out.println("Média: " + media);*/

/*achar o maior valor

int maior = notas[0];                 // começa assumindo que o primeiro é o maior
for (int i = 1; i < notas.length; i++) {
    if (notas[i] > maior) {
        maior = notas[i];
    }
}
System.out.println("Maior: " + maior); */

/*buscar um valor 

int procurado = 10;
boolean achou = false;
for (int i = 0; i < notas.length; i++) {
    if (notas[i] == procurado) {
        achou = true;
        break;                        // para o loop assim que achar
    }
}
System.out.println(achou ? "Achou!" : "Não achou"); */

/*percorrer com while

int i = 0;
while (i < notas.length) {
    System.out.println(notas[i]);
    i++;
} */
    }