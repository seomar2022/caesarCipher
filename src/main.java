public class main {

    public static void main(String[] args) {
        caesarCipher caesarCipher = new caesarCipher();

        System.out.println(caesarCipher.encode("abcz", 2));
        System.out.println(caesarCipher.encode("aa az", 1));
        System.out.println(caesarCipher.encode("hello world", 0));
        System.out.println(caesarCipher.encode("Aaa bbb"));
    }


}
