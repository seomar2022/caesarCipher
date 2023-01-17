import java.util.ArrayList;
import java.util.Arrays;

public class encode {

    public static String encode(String plainText, int n){

        //通常のアルファベット
        Character [] plainAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //暗号化アルファベット
        Character [] cipherAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //平文の各文字を辞書順でn文字分ずらして暗号文とする
        for(int i = 0; i<plainAlphabet.length; i++){
            cipherAlphabet[i] = plainAlphabet[(i+n) % plainAlphabet.length];
        }

        //for文を使うため、StringをCharArrayにする。
        char [] plainTextToCharArray = plainText.toCharArray();

        //indexOfを使うため、CharacterListをArrayListに変換
        ArrayList<Character> plainAlphabetList = new ArrayList<>(Arrays.asList(plainAlphabet));

        //暗号化された文字を入れるcharArrayを作る。lengthはplainTextと同じ。
        char [] encryptionArray = new char[plainText.length()];
        int i = 0;

        //平文から一つずつ文字を出して、その文字がplainAlphabetListの何番目に位置しているかを検索。
        // そして、同じ位置のcipherAlphabetの文字をencryptionArrayに入れる。
        for(char letter: plainTextToCharArray){
            int j = plainAlphabetList.indexOf(letter);
            if(j == -1) {
                encryptionArray[i] = ' ';
            }else {
                encryptionArray[i] = cipherAlphabet[j];
            }

            i++; //encryptionArrayの次の場所に移る。
        }
        return new String(encryptionArray); //charArrayをStringに変換して、return
    }
}
