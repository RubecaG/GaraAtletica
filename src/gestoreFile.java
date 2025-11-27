import java.io.FileWriter;
import java.io.IOException;


public class gestoreFile {

    public static synchronized void salvaPodio(String testo) {
        try (FileWriter File = new FileWriter("podio.txt",true)) {
            File.write(testo + "\n");
        } catch (IOException e) {
            System.err.println("Errore scrittura file: " + e.getMessage());
        }
    }
}

