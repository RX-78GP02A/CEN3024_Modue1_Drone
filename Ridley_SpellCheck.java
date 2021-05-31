// Author Name: Marcus Ridley
// Data: 5/30/2021
// Program Name: Ridley_SpellCheck
// Purpose: This program will read data from 2 txt files to compare them for spelling

package module_3;

        // Imports of java classes
        import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import java.util.Scanner;

    // Declaration of Ridley_SpellCheck    
    public class Ridley_SpellCheck {

    // Declaration of variables
    static String dictionary;
    static String dictionaryText;
    static String testFile;
    static String testFileText;
    static Scanner s;
    static Scanner keyboard;
    static ArrayList<String> dictionaryArray;
    static ArrayList<String> testFileArray;

  public static void main(String[] args) throws Exception{
        // Scanner that allows the user to input information
        keyboard = new Scanner(System.in);

        // Displays interface prompt
        System.out.println("This program will read data from 2 txt files to compare them for spelling.");
        System.out.println("Enter the name of the test file with it's extension name.");
        // Stores input data into the testFile variable testFile = "testStates.txt";
        testFile = keyboard.nextLine();
        System.out.println("Enter the name of the dictionary file with it's extension name.");
        // captures typed text and stores it in the dictionary variable dictionary = "dictionary.txt";
        dictionary = keyboard.nextLine();       

        // readFileAsString method converts files into String variables
        testFileText = readFileAsString(testFile);
        dictionaryText = readFileAsString(dictionary);

        // Converts String variables into ArrayLists
        readDictionary();
        readTestFile();

        // Loop that compares the indices of both ArrayLists
        for (int i=0; i < dictionaryArray.size(); i++)
        {
            // Indices have the same information don't act
            if (dictionaryArray.get(i).equals(testFileArray.get(i))) {
            }
            // Otherwise if indices don't display the work and unknown text
            else
                System.out.println(testFileArray.get(i) + " is an unknown word");
        }
    }

    // String variable conversion from file
    private static String readFileAsString(String fileName) {
        // Initializes the String variable
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(fileName)));
        }
        // Throws IOException for any converting errors
        catch (IOException e) {
            e.printStackTrace();
        }
        // returns the String to the method call
        return text;
    }

     // Converts testFile String variable into an ArrayList
    private static void readTestFile(){
        // Places testFileText to a scanner object
        s = new Scanner(testFileText);
        // Initializes testFileArray Arraylist
        testFileArray = new ArrayList<String>();
        // Pushes each String into an ArrayList index
        while (s.hasNextLine())
            testFileArray.add(s.nextLine());
    }