import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        caesarCipher caesarCipher = new caesarCipher();

//        System.out.println(caesarCipher.encode("apple", 2));
//        System.out.println(caesarCipher.encode("aa az", 1));
//        System.out.println(caesarCipher.encode("hello world", 0));
//        System.out.println(caesarCipher.encode("Aaa bbb"));
        caesarCipher.decode("crrng");
  //      System.out.println("aa");
    }


}
