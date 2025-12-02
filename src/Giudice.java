
import java.util.ArrayList;

public class Giudice {

    private static final ArrayList<Atleta> Atleti = new ArrayList<>();
    private static final ArrayList<Atleta> Podio = new ArrayList<>();

    private static final Object lockPodio = new Object();

    public static synchronized void aggiungimi(Atleta a) {
        Atleti.add(a);
    }

    public static void finito(Atleta a) {
        synchronized (lockPodio) {
            Podio.add(a);

            if (Podio.size() == Atleti.size()) {
                fineGara();
            }
        }
    }

    public static void fineGara() {
        System.out.println("\n Gara Terminata! Podio:");

        gestoreFile.svuotaFile();
        for (int i = 0; i < Podio.size(); i++) {
            Atleta a = Podio.get(i);
            System.out.println((i+1) + "° posto: " + a.nome);

            gestoreFile.salvaPodio((i+1) + "°: " + a.nome);
        }
        System.out.println("\nPodio vecchio salvato sul file");
    }

    public static void avviaGara() {
        for (int i = 3; i > 0; i--) {
            System.out.println("Partenza tra " + i);
            try { Thread.sleep(1000); }
            catch (InterruptedException e) { }
        }

        System.out.println("VIA!!!");

        for (Atleta a : Atleti) {
            new Thread(a).start();
        }
    }
}
