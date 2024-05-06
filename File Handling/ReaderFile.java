import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
     public static void main(String[] args) {
        try {
            FileReader r = new FileReader("C:\\Users\\Adarsh kumar\\desktop\\vikash25.txt");
            try {
                int i;
                while ((i = r.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                r.close();
                System.out.println("file closed ");
            }
        }   catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}
