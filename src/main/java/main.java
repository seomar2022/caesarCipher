import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        caesarCipher caesarCipher = new caesarCipher();

//        System.out.println(caesarCipher.encode("apple", 2));
//        System.out.println(caesarCipher.encode("aa az", 1));
//        System.out.println(caesarCipher.encode("hello world", 0));
//        System.out.println(caesarCipher.encode("banana"));
//        System.out.println(caesarCipher.encode("kiwi"));
//        System.out.println(caesarCipher.encode("hello happy world"));
//        caesarCipher.decode("crrng"); //apple
//        caesarCipher.decode("igug" ); //kiwi
       // caesarCipher.decode("czggj rjmgy"); //hello world
//          caesarCipher.decode("rjmgy czggj"); //world hello
     //     caesarCipher.decode("lipps lettc asvph"); //hello happy world
//        caesarCipher.decode("rovvy uytswk"); //hello kojima

//        caesarCipher.decode("ohwwf"); //happy

  //      System.out.println("aa");

        String potentialAnswer = "hello happy world";
        String[] splitPotentialAnswer = potentialAnswer.split(" ");
        int score = 0;
        String URL = "https://www.dictionary.com/browse/";
        for (int i = 0; i < splitPotentialAnswer.length; i++) {
            String searchedWord = (splitPotentialAnswer[i]);
            System.out.println(searchedWord);
            try {
                Jsoup.connect(URL).get();
                score += 1;
                System.out.println("↑○　辞書にある単語");
            } catch (HttpStatusException httpStatusException) {
                //IOExceptionの中にHttpStatusExceptionがあるので、IOExceptionより先にHttpStatusExceptionをcatch
                System.out.println("↑X　辞書にない単語");
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }


}
