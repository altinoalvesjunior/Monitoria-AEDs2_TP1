/*
 *
 * @author Altino Alves Júnior
 * Monitoria de Algoritmos e Estruturas de Dados II
 * Engenharia de Software - PUC Minas | Unidade Praça da Liberdade
 *
 */

public class IsRecursivo {

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

    private static boolean verificaVogal(String palavra, int posicao) {
        boolean vogal = false;

        if(palavra.length() > 0)
            vogal = true;

        if(posicao < palavra.length()) {
            if(palavra.charAt(posicao)!= 'a' && palavra.charAt(posicao)!= 'e'
                    && palavra.charAt(posicao)!='i'  && palavra.charAt(posicao)!='o'
                    && palavra.charAt(posicao)!='u'  && palavra.charAt(posicao)!='A'
                    && palavra.charAt(posicao)!='E'  && palavra.charAt(posicao)!='I'
                    && palavra.charAt(posicao)!='O'  && palavra.charAt(posicao)!='U')
                vogal = false;

            else if(vogal)
                vogal=verificaVogal(palavra, ++posicao);
        }

        return vogal;
    }

    public static boolean verificaVogal(String palavra) {
        return verificaVogal(palavra,0);
    }

    private static boolean verificaConsoante (String palavra, int posicao) {
        boolean consoante = false;

        if(palavra.length()>0)
            consoante = true;

        if(posicao<palavra.length()) {
            if(!('a'< palavra.charAt(posicao) && palavra.charAt(posicao)<='z' ) && !('A'< palavra.charAt(posicao) && palavra.charAt(posicao)<='Z'))
                consoante=false;

            if(palavra.charAt(posicao) == 'a' && palavra.charAt(posicao)== 'e'
                    && palavra.charAt(posicao)=='i'  && palavra.charAt(posicao)=='o'
                    && palavra.charAt(posicao)=='u'  && palavra.charAt(posicao)=='A'
                    && palavra.charAt(posicao)=='E'  && palavra.charAt(posicao)=='I'
                    && palavra.charAt(posicao)=='O'  && palavra.charAt(posicao)=='U')
                consoante=false;


            if(consoante)
                consoante = verificaConsoante(palavra, ++posicao);
        }
        return consoante;
    }

    public static boolean verificaConsoante(String palavra) {
        return verificaConsoante(palavra,0);
    }

    private static boolean verificaInteiro(String palavra, int posicao) {
        boolean inteiro = false;

        if(palavra.length()>0)
            inteiro =true;


        if(posicao < palavra.length()) {
            if(!('0'<=palavra.charAt(posicao) && palavra.charAt(posicao)<='9'))
                inteiro = false;

            if(inteiro)
                inteiro = verificaInteiro(palavra, ++posicao);
        }

        return inteiro;
    }

    public static boolean verificaInteiro(String palavra) {
        return verificaInteiro(palavra,0);
    }

    private static boolean verificaReal(String palavra, int posicao, int virgula) {
        boolean real = false;

        if(palavra.length()>0)
            real = true;

        if(posicao < palavra.length()) {
            if(palavra.charAt(posicao)=='.' || palavra.charAt(posicao)==',') {
                virgula++;

                if(virgula > 1)
                    real = false;
            }

            else if(!('0'<=palavra.charAt(posicao) && palavra.charAt(posicao)<='9'))
                real = false;

            if (real) {
                real = verificaReal(palavra, ++posicao, virgula);
            }
        }
        return real;
    }

    public static boolean verificaReal(String palavra) {
        return verificaReal(palavra,0, 0);
    }
}