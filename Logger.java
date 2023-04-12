import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static void writeFile(String data){
        try (FileWriter writer = new FileWriter("text.txt", true)){
            writer.write(data + "\n");
            writer.flush();
        }catch (IOException e){
            UI.print(e.getMessage());
        }
    }
}
