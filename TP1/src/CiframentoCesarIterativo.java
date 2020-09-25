public class CiframentoCesarIterativo {

    public static void main(String[] args) {

        String palavraUsuario = MyIO.readLine();

        while (!(palavraUsuario.equals("FIM"))) {
            MyIO.println(criptografa(palavraUsuario));
            palavraUsuario = MyIO.readLine();
        }
    }

    public static String criptografa(String palavra){
        String criptografada = "";

        for(int i = 0; i < palavra.length(); i++){
            criptografada += ((char)(palavra.charAt(i) + 3));
        }

        return criptografada;
    }
}
