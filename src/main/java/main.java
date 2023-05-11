import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.*;

public class main {

    public static void main(String[] args) {
        caesarCipher caesarCipher = new caesarCipher();
        CaesarCipherController con = new CaesarCipherController();
        System.out.println(con.encode("aa", 2));

  //     System.out.println(caesarCipher.encode("aaa", 2));
//        System.out.println(caesarCipher.encode("aa az", 1));
//        System.out.println(caesarCipher.encode("hello world", 0));
//        System.out.println(caesarCipher.encode("banana"));
//        System.out.println(caesarCipher.encode("kiwi"));
//        System.out.println(caesarCipher.encode("hello happy world"));

        System.out.println(con.decode("crrng"));//apple
//        caesarCipher.decode("igug" ); //kiwi
       // caesarCipher.decode("czggj rjmgy"); //hello world
//          caesarCipher.decode("rjmgy czggj"); //world hello
//          caesarCipher.decode("lipps lettc asvph"); //hello happy world
   //     caesarCipher.decode("rovvy uytswk"); //hello kojima

//        caesarCipher.decode("ohwwf"); //happy


    }


}
