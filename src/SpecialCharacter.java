public class SpecialCharacter {
    public static void main(String[] args) {
        String str = "Ab,c,de!$", str1 = "";
        int k = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                str1 = str1 + str.charAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                System.out.print(str1.charAt(k++));
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
