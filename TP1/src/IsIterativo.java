/*
 *
 * @author Altino Alves Júnior
 * Monitoria de Algoritmos e Estruturas de Dados II
 * Engenharia de Software - PUC Minas | Unidade Praça da Liberdade
 *
 */

public class IsIterativo {

    public static void main(String[] args) {

        String palavraUsuario = MyIO.readLine();

        while (!(palavraUsuario.equals("FIM"))) {
            MyIO.println(respostaFinal(palavraUsuario));
            palavraUsuario = MyIO.readLine();
        }
    }

    public static String respostaFinal(String entrada){
        String resposta = "";

        if(verificaVogal(entrada) == true)
            resposta = resposta + "SIM ";
        else
            resposta = resposta + "NAO ";

        if(verificaConsoante(entrada) == true)
            resposta = resposta + "SIM ";
        else
            resposta = resposta + "NAO ";

        if(verificaInteiro(entrada) == true)
            resposta = resposta + "SIM ";
        else
            resposta = resposta + "NAO ";

        if(verificaReal(entrada) == true)
            resposta = resposta + "SIM ";
        else
            resposta = resposta + "NAO ";

        return resposta;
    }

    private static boolean verificaVogal(String palavra) {
        boolean vogal = false;

        if(palavra.length() > 0){
            vogal = true;
        }

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) != 'a' && palavra.charAt(i) != 'e'
                    && palavra.charAt(i) != 'i' && palavra.charAt(i) != 'o'
                    && palavra.charAt(i) != 'u' && palavra.charAt(i) != 'A'
                    && palavra.charAt(i) != 'E' && palavra.charAt(i) != 'I'
                    && palavra.charAt(i) != 'O' && palavra.charAt(i) != 'U'){
                vogal = false;
            }
        }

        return vogal;
    }

    private static boolean verificaVogal(char letra){
        String entrada = "";
        entrada += letra;
        return verificaVogal(entrada);
    }

    private static boolean verificaConsoante(String palavra) {
        boolean consoante = false;

        if(palavra.length() > 0){
            consoante = true;
        }

        for(int i = 0; i < palavra.length(); i++) {
            if(!('a' < palavra.charAt(i) && palavra.charAt(i) <= 'z') && !('A' < palavra.charAt(i) && palavra.charAt(i) <= 'Z'))
                consoante = false;

            if(verificaVogal(palavra.charAt(i)) == true)
                consoante = false;
        }

        return consoante;
    }

    private static boolean verificaInteiro(String palavra){
        boolean inteiro = false;

        if(palavra.length() > 0){
            inteiro = true;
        }

        for(int i = 0; i < palavra.length(); i++){
            if(!('0' <= palavra.charAt(i) && palavra.charAt(i) <= '9'))
                inteiro = false;
        }

        return inteiro;
    }

    private static boolean verificaInteiro(char letra){
        String entrada = "";
        entrada += letra;
        return verificaInteiro(entrada);
    }

    private static boolean verificaReal(String palavra){
        boolean real = false;
        int virgula = 0;

        if(palavra.length() > 0){
            real = true;
        }

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == '.' || palavra.charAt(i) == ','){
                virgula ++;

                if(virgula > 1)
                    real = false;
            }

            else {
                real = verificaInteiro(palavra.charAt(i));
            }
        }
        return real;
    }
}
