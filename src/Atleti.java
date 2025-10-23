import java.util.Random;
public class Atleti implements Runnable {

int numero;
String nome;
double tempo;
double metri;
final double LUNGHEZZA =400;
final Random rand = new Random();
    public Atleti(int pNumero,String pNome){
        numero=pNumero;
        nome=pNome;
    }
@Override
public void run(){
        while(metri<LUNGHEZZA){
            metri+=rand.nextDouble(5,17);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println("metru percorsi"+metri);
        }
System.out.println(nome+"è arrivato");
}
}
