import java.util.ArrayList;

public class WordRectangle {
    public static void main(String[] args) {
//        In the end you should always read the original word
        System.out.println(createWordRectangle("pizza", 3));
//      ["piz",
//       "izz",
//       "zza"]
       System.out.println(createWordRectangle("pedassExam", 5));
//      ["passe",
//       "assed",
//       "ssedE",
//       "sedEx",
//       "edExa",
//       "dExam"]
    }
    private static ArrayList<String> createWordRectangle(String word, int width) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < (word.length() - width) + 1; i++) {
            result.add(word.substring(i, i + width));
        }
        return result;
    }
}
