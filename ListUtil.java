import java.util.LinkedList;
/**
 This class supplies a utility method to reverse the entries in a linked list.
 */
public class ListUtil
{
    /**
     Reverses the elements in a linked list
     @param strings the linked list to reverse
     */
    public static void reverse(LinkedList<String> strings)
    {
        // Complete this static method based on its JavaDoc comment.
         for(int i = 0; i < strings.size() / 2; i++) {
             String temp = strings.get(i); // temporary string var to store elements
             strings.set(i, strings.get(strings.size() -1 -i)); // makes first element the last
             strings.set(strings.size() -1 -i, temp); // makes last element set to temp var
         }
    }
}