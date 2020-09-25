/*
 *
 * @author Altino Alves Júnior
 * Monitoria de Algoritmos e Estruturas de Dados II
 * Engenharia de Software - PUC Minas | Unidade Praça da Liberdade
 *
 */

public class CiframentoCesarRecursivo {

    public static void main(String[] args) {

        String palavraUsuario = MyIO.readLine();

        while (!(palavraUsuario.equals("FIM"))) {
            MyIO.println(criptografaRecursivo(palavraUsuario));
            palavraUsuario = MyIO.readLine();
        }
    }

    public static String criptografaRecursivo (String palavra){
        return criptografaRecursivo(palavra, 0);
    }

    private static String criptografaRecursivo(String palavra, int posicao) {
        String criptografada = "";

        if (posicao < palavra.length())
            criptografada += ((char)(palavra.charAt(posicao)+3)) + criptografaRecursivo(palavra, ++posicao);

        return criptografada;
    }

}
