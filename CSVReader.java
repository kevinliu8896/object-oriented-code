import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    private Scanner in; // initialize scanner
    private String fileName; // initialize string for file path
    private ArrayList<String[]> rows; // create an array list

    CSVReader(String fileName) throws FileNotFoundException {
        try {
            in = new Scanner(new File(fileName));
            rows = new ArrayList<>();
            this.fileName = fileName;
            while (in.hasNextLine()) {
                String tok[] = in.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                for (int i = 0; i < tok.length; i++) {
                    tok[i] = tok[i].trim(); // trim
                    tok[i] = tok[i].replaceAll("\"\"", "\"");
                    if (tok[i].charAt(0) == '"') { // if the tokens index at 0 is a " then token at index i will  apply substring to get rid of the quotes
                        tok[i] = tok[i].substring(1, tok[i].length() - 1);
                    }
                }
                rows.add(tok); // add token to row
            }
            in.close(); // close scanner
        } catch (FileNotFoundException e) { // throw exception
            System.out.println("Error. File Not Found.");
        }
    }

    // methods to return number of rows, fields, and what is inside the field
    int numberOfRows() {
        return rows.size();
    }

    int numberOfFields(int row) {
        return rows.get(row).length;
    }

    String field(int row, int column) {
        return rows.get(row)[column];
    }

}
