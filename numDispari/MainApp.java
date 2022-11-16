package numDispari;
/**
 * numeri dispari da 1 a 100
 * @author Patric Pintescul, Pietro Chirdo
 */
public class MainApp {
    public static void main(String[] args) {
        // metodo 1, verifica con for(int; condition; command) if e resto (%)
        // NOTA: metodo lento passa per 50 variabili in più rispetto al metodo 2 e ha if
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // metodo 2, for(int; condition; command) che aggiunge 2
        // NOTA: metodo veloce, fa la metà delle operazioni e non ha if 
        for (int i = 1; i <= 100; i=i+2) {
            System.out.println(i);
        }
    }
}
