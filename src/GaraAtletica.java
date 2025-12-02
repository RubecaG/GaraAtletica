public class GaraAtletica {
    public static void main(String[] args) {
        System.out.println("Gara Atletica");


        new Atleta(67, "pacchiu(04)");
        new Atleta(68, "pacchioso(32)");
        new Atleta(69, "pirotecnico(12)");


        Giudice.avviaGara();
        // System.out.println("Caratteristiche Main: "+ Thread.currentThread().getName()
        // +" - " + Thread.currentThread().getPriority());
    }
}


