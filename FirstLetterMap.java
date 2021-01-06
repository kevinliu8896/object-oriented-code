import java.io.File;
import java.io.IOException;
import java.util.*;

public class FirstLetterMap {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("test2.txt");
        Scanner in = new Scanner(inputFile); // create scanner to read input file
        Map<Character, ArrayList<String>> map = new HashMap<>(); // create hash map to access characters and words that match

        while (in.useDelimiter("[^A-Za-z]+").hasNext()) { // use delimiter to ignore anything that isnt a word or letter(reading word by word)
            String line = in.next(); // looks for next word
            String words[] = line.toLowerCase().trim().split("\\s+"); // remove all punctuation such as periods, commas, etc.
            for (String ch : words) { // enhanced for loop to go through words
                ch = ch.toLowerCase(); // set all characters to lower case
                if (!map.containsKey(ch.charAt(0))) { // filling the Hash Map, if the key does not exist put key in
                    map.put(ch.charAt(0), new ArrayList<String>());
                }
                ArrayList<String> listOfWords = map.get(ch.charAt(0)); // store words into an array list
                if(!listOfWords.contains(ch)) {
                    listOfWords.add(ch); // adding words to array list with matching char values
                    map.put(ch.charAt(0), listOfWords);
                }
            }
        }
        for (Map.Entry<Character, ArrayList<String>> entry : map.entrySet()) {
            ArrayList<String> wordList = entry.getValue();
            Collections.sort(wordList); // collections is used to sort words and characters alphabetically
            System.out.println(entry.getKey() + ": " + wordList); // display
        }
        in.close(); // close scanner
    }
}
