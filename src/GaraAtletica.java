public class GaraAtletica {
    public static void main(String[] args) {
        System.out.println("Gara Atletica");


        new Atleta(67, "babis");
        new Atleta(68, "mumus");
        new Atleta(69, "piro");


        Giudice.avviaGara();
        // System.out.println("Caratteristiche Main: "+ Thread.currentThread().getName()
        // +" - " + Thread.currentThread().getPriority());
    }
}
