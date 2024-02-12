package LeetCode.LeetCode75.ArrayString;
//.StringIndexOutOfBoundsException
public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder exit = new StringBuilder();

        int menor = Math.min(word1.length(), word2.length());

        for (int i = 0; i < menor; i++) {
            exit.append(word1.charAt(i));
            exit.append(word2.charAt(i));
        }

        if(word1.length() > word2.length()){
            exit.append(word1.substring(menor));
        } else if (word2.length() > word1.length()){
            exit.append(word2.substring(menor));
        }

        return exit.toString();
    }
}
