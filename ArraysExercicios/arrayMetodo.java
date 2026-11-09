 public class arrayMetodo{
//array so guarda valor do mesmo tipo,estrutura de dados homogenea ele pode ter uma dimensão, ou N dimensões, pode ter arrays com mais de uma dimensão
    public static void main(String[] args) {
        // operações em arrays
        int[] numeros = { 1, 25, 3, 46, 5, 6, 7, 8, 9, 0 }; // criar array preechendo os valores inicias com 10 posições
                                                            // e
                                                            // ja preencher os valores dela com determinadas posições
        numeros[0] = 40;
        String[] dias = { "segunda", "terça", "quarta", "quinta", "sexta" }; // array em string com valores ja definidos
        String[] nomes = { "ana", "marcela", "edinaldo", "malu" }; // array de String com valores ja definidos sempre
                                                                   // usar {} para os nomes do valores
        // pegar informações no array
       System.out.println(maior(numeros));
        System.out.println(menor(numeros));
        System.out.println (qtdPares(numeros));
        System.out.println(procurar(nomes, "ana"));
        System.out.println(buscar(dias, "Sexta"));
        System.out.println(buscar(nomes, "ana"));
    }


    public static int buscar(String[] array, String texto){
        for(int i = 0; i < array.lenght; i++){
            if (array[i].equals(texto)){
                return i;
            }
        }
        return -1;
    }

public static boolean procurar(String[] array,String texto){ ///pra procurar algo no array, recebo duas coisas a variavel e oque eu estou procurando na variavel boolean so vai retornar verdadeiro ou falso
for (String s: array){
    if(s.equals(texto)){
        return true;
    }
}
return false;
} 

//um array bidimensional e uma comoda que 
// dentro de cada gaveta dentro da comada tivesse outra separação, um array de array bidimensional,
//  e como se dentro da minha posição 0 eu tivesse  outro array como criar um array bidimensional (ele nao e uma tabela, ele e um array de array)
// int [] v = new int[3](colchetes são arrays[]) o bidimensional eu colo dois colchetes int [] [] b = new int [3],[2] um array de array de inteiro
 // se fosse um tridimensional int [] [] [] um array de array de array de inteiros, nada mais e que um array dentro do outro



public static int qtdImpares(int[]array){
    return array.lenght - qtdPares(array); //se tem qtd de pares feita ela elimina uma outra
}

public static int qtdqtdPares(int[] array){
int qtd =0;
for (int numero : array){
    if (numero % 2 == 0){
        qtd++;
    }
}
return qtd;
}


// metodo para percorrer o maior numero do array
public static int maior(int[] array) {
    int maior = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] > maior) {
            maior = array[i];
        }
    }
    return maior;
}

// metodo para percorrer o menor numero do array(so mudar o nome da variavel)
public static int menor(int[] array) {
    int menor = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] > menor) {
            menor = array[i];
        }
    }
    return menor;
}
 
}