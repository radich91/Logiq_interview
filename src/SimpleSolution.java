import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class SimpleSolution {

    public static void main(String[] args) {
        String action = "PALINDROME";
        String text = "ABBa";
        //runManipulatorAndPrintResult(text, action);
        readFromFile();
    }

    public static void runManipulatorAndPrintResult(String text, String action) {
        String manipulatedText = StringManipulator.manipulate(text, action);
        System.out.println("Text: [" + text + "] ran Action: [" + action + "] with result: [" + manipulatedText + "]");
    }

    public static void readFromFile() {
        BufferedReader reader;
        try {
            URL url = SimpleSolution.class.getResource("actiontexts.txt");
            if (url != null) {
                reader = new BufferedReader(new FileReader(
                        url.getPath()));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String action = parts[0]; // TODO: consider using .trim() to remove leading and trailing spaces
                        String text = parts[1];
                        runManipulatorAndPrintResult(text, action);
                    } // TODO: error handling
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
