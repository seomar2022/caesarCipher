import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.*;

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
          caesarCipher.decode("lipps lettc asvph"); //hello happy world
//        caesarCipher.decode("rovvy uytswk"); //hello kojima

//        caesarCipher.decode("ohwwf"); //happy

  //      System.out.println("aa");

//        String potentialAnswer = "hello happy world";
//        String[] splitPotentialAnswer = potentialAnswer.split(" ");
//        int score = 0;
//        String URL = "https://www.dictionary.com/browse/";
//        for (int i = 0; i < splitPotentialAnswer.length; i++) {
//            String searchedWord = splitPotentialAnswer[i];
//            System.out.println(searchedWord);
//            System.out.println("url: "+ URL + searchedWord);
//            try {
//                Jsoup.connect(URL + searchedWord).get();
//                score += 1;
//                System.out.println("↑○　辞書にある単語");
//            } catch (HttpStatusException httpStatusException) {
//                //IOExceptionの中にHttpStatusExceptionがあるので、IOExceptionより先にHttpStatusExceptionをcatch
//                System.out.println("↑X　辞書にない単語");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        Map<Integer, Double> map = new HashMap<Integer, Double>();

        map.put(1, 0.8);
        map.put(2, 0.3);
        map.put(3, 0.6);
        map.put(4, 0.9);
        map.put(5, 0.2);

        List<Integer> keySetList = new ArrayList<>(map.keySet());

        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        for(Integer key : keySetList) {
            System.out.println("key : " + key + " value : " + map.get(key));
        }

        /*
        https://www.casleyconsulting.co.jp/blog/engineer/114/
        一般の方法
        IntFunc intFunc1 = new IntFunc(){
          @Override
          public int func(int x){
            return x+x;
          }
        }
        ラムダ式
        IntFunc intFunc2 = (int x) -› {return x+x;};
        関数名いらにない


          */
    }


}
