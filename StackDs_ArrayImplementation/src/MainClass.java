import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        File myTestFile = new File("C:\\Users\\Prosper's PC\\Documents\\LinkedListTesting.txt");
        Stack myStack = new Stack(10);
        try {
            Scanner readInput = new Scanner(myTestFile);
            while (readInput.hasNextLine()) {
                String data = readInput.nextLine();
                if (data.equals("-")) {
                    System.out.println(myStack.pop());
                } else {
                    myStack.push(data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
