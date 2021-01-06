import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PairTester {
    public static void main(String[] args) {
        Pair<Integer, Integer> p1 = new Pair<>(1, 2);
        String word = "hello";
        Pair<String, Integer> p2 = new Pair<>(word, word.length());
        System.out.println("[" + p1.getFirst() + ", " + p1.getSecond() + "]");
        System.out.println("[" + p2.getFirst() + ", " + p2.getSecond() + "]");
        System.out.println(p1.equals(p2));

        ArrayList<Pair<String, ArrayList<String>>> arrayList = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        words.add("Annoyed");
        words.add("Irritated");
        words.add("Irate");

        String w = "Angry";
        arrayList.add(new Pair<>(w, words));

        ArrayList<String> words2 = new ArrayList<>();
        words2.add("Sad");
        words2.add("Gloomy");

        String w2 = "Depressed";
        arrayList.add(new Pair<>(w2, words2));

        System.out.println(arrayList);
        System.out.println("\n----------------------------------------------------------\n\nSorting alphabetically...");
        Collections.sort(words);
        Collections.sort(words2);
        arrayList.sort(new Comparator<Pair<String, ArrayList<String>>>() {
            @Override
            public int compare(Pair<String, ArrayList<String>> o1, Pair<String, ArrayList<String>> o2) {
                return o1.getFirst().compareTo(o2.getFirst());
            }
        });
        System.out.println(arrayList);
    }
}
