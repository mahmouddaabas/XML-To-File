import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class handles writing values to a file.
 * @Author Mahmoud Daabas
 */
public class Writer {

    /**
     * Writes the passed value to a text file and saves it in /resources.
     * @param value The value to write to the file.
     */
    public void writeValueToFile(String value){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/resources/targetValue.txt"));
            bufferedWriter.write(value);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
