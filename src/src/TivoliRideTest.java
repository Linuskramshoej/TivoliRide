import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner tivoliScanner = new Scanner(System.in);

        System.out.println("Indtast din højde");

        int height = tivoliScanner.nextInt();
        TivoliRide tivoliRide1 = new TivoliRide(height);

        System.out.println(tivoliRide1.getTivoliRide());

        tivoliScanner.close();
    }
}
