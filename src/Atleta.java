import java.util.Random;

public class Atleta implements Runnable {
    int numero;
    String nome;
    double metri = 0;
    final double LUNGHEZZAGARA = 100.0;

    public Atleta(int pNumero, String pNome) {
        numero = pNumero;
        nome = pNome;
        Giudice.aggiungimi(this);
    }

    @Override
    public void run() {
        Random rand = new Random();

        while (true) {
            synchronized (this) {
                if (metri >= LUNGHEZZAGARA) break;
                metri += rand.nextDouble(10);
            }

            System.out.printf("%s ha percorso %.2f \n", nome, metri);

            try { Thread.sleep(800); }
            catch (InterruptedException e) { }
        }

        Giudice.finito(this);
    }
}








