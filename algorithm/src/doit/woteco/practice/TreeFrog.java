package doit.woteco.practice;

public class TreeFrog {

    public static void main(String[] args) {

        String word = "I love you";
        char[] charArr = word.toCharArray();
        StringBuilder stbd = new StringBuilder();

        for (char c : charArr) {

            int askii = (int)c;
            if (askii >= 65 && askii <= 90) {
                stbd.append((char) (155 - askii));
            } else if (askii >= 97 && askii <= 122) {
                stbd.append((char) (219 - askii));
            }else stbd.append(c);

        }
        System.out.println(stbd.toString());

    }
}

