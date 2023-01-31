import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class caesarCipher {

    ////member variables
    //通常のアルファベット
    Character [] plainAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    //暗号化アルファベット
    Character [] cipherAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    //constructor
    public caesarCipher(){}

    public String encode(String plainText, int n){
        plainText = plainText.toLowerCase();
        return apply(plainText, switchAlphabetPosition(n));
    }

    //overloading
    //int nが指定されなかった場合は１以上、２６以下の定数の中で、ランダムに適用する
    public String encode(String plainText){
        Random random = new Random();
        plainText = plainText.toLowerCase();

        return apply(plainText, switchAlphabetPosition(random.nextInt(plainAlphabet.length) + 1));
    }

    public String decode(String ciphertext){
        String [] potentialAnswerArray = new String[plainAlphabet.length];
        for(int i=0; i<plainAlphabet.length; i++){
            String potentialAnswer = encode(ciphertext, i);
            System.out.println(potentialAnswer);

            System.out.println(searchForWord(potentialAnswer));
        }
        //searchForWord(potentialAnswer)のreturnが高い順で

        return "aa";
    }

    //単語が辞書にあったら１を、なければ０をreturn
    public int searchForWord(String potentialAnswer){
        String URL = "https://www.dictionary.com/browse/";
        String word = potentialAnswer;
        URL += word;

        try {
            Jsoup.connect(URL).get();
            System.out.println("↑○　辞書にある単語");
            return 1;
        } catch (HttpStatusException httpStatusException){
            //IOExceptionの中にHttpStatusExceptionがあるので、IOExceptionより先にHttpStatusExceptionをcatch
            System.out.println("↑X　辞書にない単語");
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        //平文の確率が高い順で、arrayに入れる。同じ確率であれば、アルファベット順に。

    }

    //平文の各文字を辞書順でn文字分ずらして暗号文とするmethod
    public Character [] switchAlphabetPosition(int n){
        for(int i = 0; i<plainAlphabet.length; i++){
            cipherAlphabet[i] = plainAlphabet[(i+n) % plainAlphabet.length];
        }
        return  cipherAlphabet;
    }

    //n文字分ずらしたアルファベットを適応するmethod
    public String apply(String plainText, Character [] cipherAlphabet){

        //indexOfを使うため、CharacterListをArrayListに変換
        ArrayList<Character> plainAlphabetList = new ArrayList<>(Arrays.asList(plainAlphabet));

        //暗号化された文字を入れるcharArrayを作る。lengthはplainTextと同じ。
        char [] encryptionArray = new char[plainText.length()];
        int i = 0;

        //平文から一つずつ文字を出して、その文字がplainAlphabetListの何番目に位置しているかを検索。
        // そして、同じ位置のcipherAlphabetの文字をencryptionArrayに入れる。
        for(char letter: plainText.toCharArray()){  //for文を使うため、StringをCharArrayにする。
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
