
public class Strings {
    public static void main(String[] args) {
        String s1 = "abc";
        String s3 = "abc";

        String s2 = new String("abc");
        String s4 = new String("abc");

        if (s1 == s3) {
            System.out.println("mathed");
        } else {
            System.out.println("not matched");
        }

        s1.equals(s2);
    }
}