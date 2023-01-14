public class encode {

    public static void main(String[] args) {
        System.out.println("Hello World");
        char [] plainAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char [] cipherAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println(plainAlphabet);

        int n = 2;

        for(int i = 0; i<plainAlphabet.length; i++){
            cipherAlphabet[i] = plainAlphabet[(i+n) % plainAlphabet.length];
        }
        String plainText = "happy";
        char [] plainTextToChar = plainText.toCharArray();

        for(char letter: plainTextToChar){
            System.out.println(plainAlphabet.indexOf(letter));

        }
        System.out.println(plainTextToChar);
        System.out.println(plainTextToChar[0]);


        System.out.println(plainAlphabet);
        System.out.println(cipherAlphabet);

    }
//
//    public static boolean encode(String str, int n){
//
//        return true;
//    }
}
