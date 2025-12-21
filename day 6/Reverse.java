public class Reverse {
    public static void main(String[] args) {
        String s ="the sky is blue";
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }   
}