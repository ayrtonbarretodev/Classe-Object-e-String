package br.com.ayrton;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Alura";
        //String outro = new String("Alura");

        System.out.println("Length");
        int tamanhoDoNome = nome.length();
        System.out.println(tamanhoDoNome);

        System.out.println();

        System.out.println("Replace");
        String novaPalavra = nome.replace('A', 'a');
        System.out.println(novaPalavra);

        System.out.println();

        System.out.println("toUpperCase");
        String palavraMaiuscula = nome.toUpperCase();
        System.out.println(palavraMaiuscula);

        System.out.println();

        System.out.println("toLowerCase");
        String palavraMinuscula = nome.toLowerCase();
        System.out.println(palavraMinuscula);

        System.out.println();

        System.out.println("charAt");
        char caracter = nome.charAt(2);
        System.out.println(caracter);
        //Retorna o valor char no índice especificado.

        System.out.println();

        System.out.println("indexOf");
        int posicao = nome.indexOf('r');
        System.out.println(posicao);
        //Retorna o índice dentro desta string da primeira ocorrência do caractere especificado.

        System.out.println();

        System.out.println("substring");
        String metodo1 = nome.substring(1); //inclue a letra de índice 1
        System.out.println("Substring somente informando o índice inicial: " + metodo1);
        String metodo2 = nome.substring(1,3); //inclue a letra de indice inicial (1) e exclui a letra do índice final
        System.out.println("Substring informando o índice inicial e o índice final: " + metodo2);

        System.out.println();

        System.out.println("isEmpty");
        String vazio = "";
        boolean éVazio = vazio.isEmpty();
        System.out.println(éVazio);

        System.out.println();

        System.out.println("trim");
        String endereco = "Avenida Prudente de Morais        ";
        String semEspacos = endereco.trim();
        System.out.println(semEspacos);

        System.out.println();

        System.out.println("contains");
        System.out.println(endereco.contains("Avenida")); //true
        System.out.println(endereco.contains("Avennidas")); //false



    }
}
