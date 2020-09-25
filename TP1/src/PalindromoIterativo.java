/*
 *
 * @author Altino Alves Júnior
 * Monitoria de Algoritmos e Estruturas de Dados II
 * Engenharia de Software - PUC Minas | Unidade Praça da Liberdade
 *
 */

public class PalindromoIterativo {

    public static void main(String[] args) {

        String palavraUsuario = MyIO.readLine();

        while (!(palavraUsuario.equals("FIM"))) {
            MyIO.println(respostaPalindromo(palavraUsuario));
            palavraUsuario = MyIO.readLine();
        }
    }

    public static String respostaPalindromo(String palavra){
        if(verificaPalindromo(palavra))
            return "SIM";
        return "NAO";
    }

    private static boolean verificaPalindromo(String palavra) {

        for(int i = 0; i < palavra.length(); i++) {
            if(palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

}