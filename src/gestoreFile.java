import java.io.*;

public class gestoreFile {

    public static synchronized void salvaPodio(String testo) {
        try (FileWriter File = new FileWriter("podio.txt", true)) {
            File.write(testo + "\n");
        } catch (IOException e) {
            System.err.println("Errore scrittura file: " + e.getMessage());
        }
    }

    public static synchronized void leggiFile(){
        File file = new File("podio.txt");
        if(!file.exists()){
            System.out.println("File non esiste");
            return;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String riga;
            while((riga = br.readLine()) != null)
                System.out.println(riga);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized void svuotaFile() {
        try (FileWriter File = new FileWriter("podio.txt")) {
            File.write("");
        } catch (IOException e) {
            System.err.println("Errore scrittura file: " + e.getMessage());
        }
    }
}