import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class LogiqInterview {

    public static void main(String[] args) {
        boolean useAdvanced = true;
        if (args.length > 0) {
            useAdvanced = args[0].equals("advanced");
        }
        _runAndPrint(useAdvanced);
    }

    private static void _runAndPrint(boolean useAdvanced) {
        ArrayList<String> instructions = _getValidInstructions();
        for(String instruction: instructions) {
            String[] parts = instruction.split(":", 2); // Should always return String[2]
            if (parts.length == 2) {
                String action = parts[0];
                String text = parts[1];
                String manipulatedText;
                if (useAdvanced) {
                    AdvancedStringManipulator.loadActions();
                    manipulatedText = AdvancedStringManipulator.manipulate(text, action);
                } else {
                    manipulatedText = SimpleStringManipulator.manipulate(text, action);
                }
                _printResult(text, action, manipulatedText);
            }
        }
    }

    private static void _printResult(String originalText, String action, String manipulatedText) {
        System.out.println("Text: [" + originalText + "] ran Action: [" + action + "] with result: [" + manipulatedText + "]");
    }

    /**
     * Reads the lines from the test file and store them in memory
     * by using an ArrayList for easy access and manipulation
     * @return ArrayList<String>
     */
    private static ArrayList<String> _getLinesFromTestFile() {
        ArrayList<String> instructions = new ArrayList<>();
        BufferedReader reader;
        try {
            URL url = LogiqInterview.class.getResource("actionTexts.txt");
            if (url != null) {
                reader = new BufferedReader(new FileReader(url.getPath()));
                String line;
                while ((line = reader.readLine()) != null) {
                    instructions.add(line);
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instructions;
    }

    private static ArrayList<String> _getValidInstructions() {
        ArrayList<String> instructions = _getLinesFromTestFile();
        ArrayList<String> invalidInstructions = new ArrayList<>();
        int currentLineNum = 1;
        String validFormatPattern = "[^:]+:[^:]+"; // at least one symbol(not colon), followed by colon, followed by at least one symbol(not colon).
        for(String instruction: instructions) {
            if (!instruction.matches(validFormatPattern)) {
                System.out.println("Invalid format at line[" + currentLineNum + "] : " + instruction);
                invalidInstructions.add(instruction);
            }
            currentLineNum++;
        }
        instructions.removeAll(invalidInstructions);
        return instructions;
    }

}
