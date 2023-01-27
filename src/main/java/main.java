import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        String URL = "https://en.dict.naver.com/#/search?query=askldjf;ae";
        Document doc;

        //https://jul-liet.tistory.com/209
        try {
            doc = Jsoup.connect(URL).get();
            System.out.println( doc.toString() );
            Elements elem = doc.select(".section section_empty");
            System.out.println(elem);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ///////////////////////////////////

//        try {
//            //対象となるurl
//            String URL = "https://en.wiktionary.org/wiki/askdfj;asd";
//
//            // Connection
//            Connection conn = Jsoup.connect(URL);
//
//            // HTML parsing
//            Document html = conn.get(); // conn.post();指定したページの内容を持ってくる
//
//            // 4. HTML 出力
//        //    System.out.println( html.toString() );
//           // Elements elem = html.select(".plainlinks");
//          //  System.out.println(elem);
//            System.out.println(html.getElementsByClass(".plainlinks"));
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        caesarCipher caesarCipher = new caesarCipher();

//        System.out.println(caesarCipher.encode("apple", 2));
//        System.out.println(caesarCipher.encode("aa az", 1));
//        System.out.println(caesarCipher.encode("hello world", 0));
//        System.out.println(caesarCipher.encode("Aaa bbb"));
        caesarCipher.decode("crrng");
        System.out.println("aa");
    }


}
