/*
 *
 * @author Altino Alves Júnior
 * Monitoria de Algoritmos e Estruturas de Dados II
 * Engenharia de Software - PUC Minas | Unidade Praça da Liberdade
 *
 */

public class PalindromoRecursivo {

    public static void main(String[] args) {

        String palavraUsuario = MyIO.readLine();

        while (!(palavraUsuario.equals("FIM"))) {
            MyIO.println(respostaPalindromo(palavraUsuario));
            palavraUsuario = MyIO.readLine();
        }
    }

    public static String respostaPalindromo(String palavra){
        if(verificaPalindromo(palavra, 0, palavra.length() - 1))
            return "SIM";
        return "NAO";
    }

    private static boolean verificaPalindromo(String palavra, int primeiraPosicao, int ultimaPosicao){
        boolean palindromo = false;

        if(ultimaPosicao <= primeiraPosicao){
            if(palavra.charAt(primeiraPosicao) == palavra.charAt(ultimaPosicao))
                palindromo = true;
        }

        else {
            if(palavra.charAt(primeiraPosicao) != palavra.charAt(ultimaPosicao))
                palindromo = false;
            else
                palindromo = verificaPalindromo(palavra, ++primeiraPosicao, --ultimaPosicao);
        }

        return palindromo;
    }
}
