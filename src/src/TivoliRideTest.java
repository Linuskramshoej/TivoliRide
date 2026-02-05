import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner tivoliScanner = new Scanner(System.in);

        System.out.println("Indtast din højde");

        int height = tivoliScanner.nextInt();
        TivoliRide tivoliRide1 = new TivoliRide(height,185);
        TivoliRide tivoliRide2 = new TivoliRide(height,160);
        TivoliRide tivoliRide3 = new TivoliRide(height,200);

        System.out.println("Ride 1: "+ tivoliRide1.getTivoliRide());
        System.out.println("Ride 2: "+ tivoliRide2.getTivoliRide());
        System.out.println("Ride 3: "+ tivoliRide3.getTivoliRide());

        tivoliScanner.close();
    }
}
