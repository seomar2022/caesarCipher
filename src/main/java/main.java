import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class main {

    public static void main(String[] args) {

        try {
            //対象となるurl
            String URL = "https://www.dictionary.com/browse/apple";

            // Connection
            Connection conn = Jsoup.connect(URL);

            // HTML parsing
            Document html = conn.get(); // conn.post();

            // 4. HTML 出力
            System.out.println( html.toString() );
            // System.out.println(html.getElementsByClass("h1"));


        } catch (IOException e) {
            e.printStackTrace();
        }

        caesarCipher caesarCipher = new caesarCipher();

//        System.out.println(caesarCipher.encode("apple", 2));
//        System.out.println(caesarCipher.encode("aa az", 1));
//        System.out.println(caesarCipher.encode("hello world", 0));
//        System.out.println(caesarCipher.encode("Aaa bbb"));
        caesarCipher.decode("crrng");
        System.out.println("aa");
    }


}
