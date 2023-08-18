package OOP_HW6;

import java.io.FileWriter;
import java.io.IOException;

public class OrderFileWriter {

    public void writeToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            writer.write(content);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}