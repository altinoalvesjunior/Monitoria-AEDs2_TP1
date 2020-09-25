import java.util.Random;

/*
*
* @author Altino Alves Júnior
* Monitoria de Algoritmos e Estruturas de Dados II
* Engenharia de Software - PUC Minas | Unidade Praça da Liberdade
*
*/

public class AlteracaoAleatoria {

    public static void main(String[] args) {
        Random gerador = new Random();
        gerador.setSeed(4);

        String palavraUsuario = MyIO.readLine();

        while (!(palavraUsuario.equals("FIM"))) {
            MyIO.println(altera(palavraUsuario, gerador));
            palavraUsuario = MyIO.readLine();
        }
    }

    public static String altera(String palavra, Random random){
        String novaPalavra = "";

        char primeiraLetra = (char)('a' + (Math.abs(random.nextInt()) % 26));
        char segundaLetra = (char)('a' + (Math.abs(random.nextInt()) % 26));

        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == primeiraLetra)
                novaPalavra += segundaLetra;
            else
                novaPalavra += palavra.charAt(i);
        }

        return novaPalavra;
    }
}